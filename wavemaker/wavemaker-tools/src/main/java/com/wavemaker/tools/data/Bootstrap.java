/*
 *  Copyright (C) 2008-2011 VMware, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.tools.data;

import com.wavemaker.tools.service.ServiceFactoryManager;
import com.wavemaker.tools.project.LocalStudioFileSystem;

/**
 * Registers factories for the data subsystem.
 * 
 * @author Simon Toens
 */
public class Bootstrap {

    public static void main(String[] args) {
        ServiceFactoryManager mgr = ServiceFactoryManager.getInstance();
        DataServiceDefinitionFactory fac = new DataServiceDefinitionFactory(new LocalStudioFileSystem());
        mgr.addServiceDefinitionFactory(fac);
        mgr.addServiceGeneratorFactory(fac);
    }

    private Bootstrap() {
    }

}