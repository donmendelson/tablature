/*
 * Copyright 2020 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package io.fixprotocol.md.event.mutable;

import io.fixprotocol.md.event.Context;
import io.fixprotocol.md.event.MutableDocumentation;

public class DocumentationImpl implements MutableDocumentation {

  private final String documentation;
  private Context parent;
  private final String format;

  /**
   * Create markdown documentation, that is ordinary paragraphs
   * 
   * @param documentation contents
   */
  public DocumentationImpl(String documentation) {
    this(documentation, MARKDOWN);
  }

  /**
   * Create documentation in a specified format
   * 
   * @param documentation contents
   * @param format the format of the documentation. This corresponds to infostring of a fenced code
   *        block, as defined by the markdown specification. Originally, it was the name of a
   *        programming language to support syntax-specific highlighting. However, it has been
   *        extended to support various encodings, such as XML. In some cases, it may map to a media
   *        type.
   */
  public DocumentationImpl(String documentation, String format) {
    this.documentation = documentation;
    this.format = format;
  }

  @Override
  public MutableDocumentation documentation(String documentation) {
    return this;
  }

  @Override
  public String getDocumentation() {
    return documentation;
  }

  @Override
  public Context getParent() {
    return parent;
  }

  @Override
  public void setParent(Context parent) {
    this.parent = parent;
  }

  @Override
  public String getFormat() {
    return format;
  }

}
