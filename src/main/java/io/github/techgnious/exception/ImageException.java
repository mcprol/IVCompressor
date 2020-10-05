/*
 * Copyright 2020 Srikanth Reddy Anreddy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.techgnious.exception;

/**
 * @author srikanth.anreddy
 *
 */
public class ImageException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 843374234004786853L;

	public ImageException() {
		super();
	}

	public ImageException(String message, Throwable cause) {
		super(message, cause);
	}

	public ImageException(String message) {
		super(message);
	}

	public ImageException(Throwable cause) {
		super(cause);
	}
}
