/**
 * Copyright 2014-present Ajay Sahani
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.ajra.multiactiontextview;

/**
 * 
 * @author Ajay Sahani
 * @seeA :Interface to handle click on sub string of TextView.
 * 
 */
public interface MultiActionTextviewClickListener {

	/**
	 * 
	 * @param inputObject
	 *            : Object which we had sent in request getting back when click
	 *            operation occur basically use to identify which part of Text
	 *            clicked. User operation type variable to identify for which
	 *            section of text clicked.
	 */
	public void onTextClick(InputObject inputObject);
}
