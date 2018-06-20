/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.geronimo.microprofile.openapi.impl.model;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

import java.util.LinkedHashMap;
import java.util.List;

import javax.enterprise.inject.Vetoed;

import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;

@Vetoed
public class SecurityRequirementImpl extends LinkedHashMap<String, List<String>> implements SecurityRequirement {

    @Override
    public SecurityRequirement addScheme(final String securitySchemeName, final String scope) {
        return addScheme(securitySchemeName, singletonList(scope));
    }

    @Override
    public SecurityRequirement addScheme(final String securitySchemeName, final List<String> scopes) {
        put(securitySchemeName, scopes);
        return this;
    }

    @Override
    public SecurityRequirement addScheme(final String securitySchemeName) {
        return addScheme(securitySchemeName, emptyList());
    }
}
