/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.nativeplatform.toolchain.internal.metadata;

import org.gradle.platform.base.internal.toolchain.SearchResult;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface CompilerMetaDataProvider<T extends CompilerMetadata> {

    SearchResult<T> getCompilerMetaData(File binary, List<String> additionalArgs, List<File> searchPath);

    SearchResult<T> getCompilerMetaData(File binary, List<String> additionalArgs, List<File> searchPath, Map<String, String> environmentVariables);

    CompilerType getCompilerType();

}
