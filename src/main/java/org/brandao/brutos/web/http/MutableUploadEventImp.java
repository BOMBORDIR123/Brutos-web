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

/**
 * 
 * @author Brandao
 *
 */
public class MutableUploadEventImp 
	implements MutableUploadEvent{

	private long contentLength;
	
	private long bytesRead;
	
	private boolean multipart;
	
	public boolean isMultipart() {
		return this.multipart;
	}

	public long getContentLength() {
		return this.contentLength;
	}

	public long getBytesRead() {
		return this.bytesRead;
	}

	public void setContentLength(long value) {
		this.contentLength = value;
	}

	public void setBytesRead(long value) {
		this.bytesRead = value;
	}

	public void addBytesRead(long value) {
		this.bytesRead += value;
	}

}
