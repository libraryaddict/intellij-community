/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.jarRepository;

import com.intellij.openapi.extensions.AbstractExtensionPointBean;
import com.intellij.openapi.extensions.ExtensionPointName;
import com.intellij.util.xmlb.annotations.Attribute;
import com.intellij.util.xmlb.annotations.Tag;
import org.jetbrains.annotations.Nls;

public final class RepositoryLibraryDefinition extends AbstractExtensionPointBean {
  public static final ExtensionPointName<RepositoryLibraryDefinition> EP_NAME = ExtensionPointName.create("com.intellij.repositoryLibrary");

  @Attribute("name")
  public @Nls(capitalization = Nls.Capitalization.Title) String name;

  @Tag("groupId")
  public String groupId;

  @Tag("artifactId")
  public String artifactId;
}
