/*
 * Copyright (c) 2008-2016, GigaSpaces Technologies, Inc. All Rights Reserved.
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

package com.gigaspaces.internal.server.space.operations;

import com.gigaspaces.internal.client.spaceproxy.operations.UnregisterLocalViewSpaceOperationRequest;
import com.gigaspaces.internal.client.spaceproxy.operations.UnregisterLocalViewSpaceOperationResult;
import com.gigaspaces.internal.server.space.SpaceImpl;
import com.gigaspaces.security.authorities.SpaceAuthority.SpacePrivilege;

/**
 * @author Niv Ingberg
 * @since 9.5.0
 */
@com.gigaspaces.api.InternalApi
public class UnregisterLocalViewSpaceOperation extends AbstractSpaceOperation<UnregisterLocalViewSpaceOperationResult, UnregisterLocalViewSpaceOperationRequest> {
    @Override
    public void execute(UnregisterLocalViewSpaceOperationRequest request, UnregisterLocalViewSpaceOperationResult result, SpaceImpl space, boolean oneway)
            throws Exception {
        space.beforeTypeOperation(true, request.getSpaceContext(), SpacePrivilege.NOT_SET, null/*typeName*/);
        space.getEngine().getMemoryManager().monitorMemoryUsage(true);

        space.getEngine().unregisterLocalView(request.getViewStubHolderName());
    }

    @Override
    public String getLogName(UnregisterLocalViewSpaceOperationRequest request, UnregisterLocalViewSpaceOperationResult result) {
        return "unregister local view";
    }
}
