/*
 * Brutos Web MVC http://www.brutosframework.com.br/
 * Copyright (C) 2009-2017 Afonso Brandao. (afonso.rbn@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brandao.brutos.web.http;

import java.io.File;

/**
 * 
 * @author Brandao
 */
public class UploadedFileImp implements UploadedFile{
    
    private File file = null;
    private String contentType;
    private String fileName;
    
    public UploadedFileImp( File file, String contentType ) {
        this( file, contentType, null );
    }
    
    public UploadedFileImp( File file ) {
        this( file, null, null );
    }
    
    public UploadedFileImp( File file, String contentType, String fileName ) {
        setFile(file);
        setContentType(contentType);
        setFileName(fileName);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
