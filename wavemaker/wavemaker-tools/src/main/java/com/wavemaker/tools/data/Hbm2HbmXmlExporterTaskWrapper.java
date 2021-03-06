/*
 *  Copyright (C) 2012-2013 VMware, Inc. All rights reserved.
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

import org.hibernate.tool.ant.Hbm2HbmXmlExporterTask;
import org.hibernate.tool.ant.HibernateToolTask;

import com.wavemaker.tools.io.Folder;

public class Hbm2HbmXmlExporterTaskWrapper extends Hbm2HbmXmlExporterTask {

    private Folder destDir;

    public Hbm2HbmXmlExporterTaskWrapper(HibernateToolTask parent, Folder destDir) {
        super(parent);
        this.destDir = destDir;
    }

    public HibernateToolTask getParent() {
        return super.parent;
    }

    public void setDestDir(Folder destDir) {
        this.destDir = destDir;
    }

    public Folder getDestDir() {
        return this.destDir;
    }
}