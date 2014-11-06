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

import android.text.SpannableStringBuilder;

public class InputObject {

	/**
	 * start index
	 */
	private int startSpan;
	/**
	 * end index
	 */
	private int endSpan;
	/**
	 * append entire sub text into SpannableStringBuilder
	 */
	private SpannableStringBuilder stringBuilder;
	/**
	 * Call back to handle click event
	 */
	private MultiActionTextviewClickListener multiActionTextviewClickListener;
	/**
	 * input object which we want when click event occur.
	 */
	private Object inputObject;
	/**
	 * uniquely identify on which part of text view click.
	 */
	private int OperationType;

	public Object getInputObject() {
		return inputObject;
	}

	public void setInputObject(Object inputObject) {
		this.inputObject = inputObject;
	}

	public int getOperationType() {
		return OperationType;
	}

	public void setOperationType(int operationType) {
		OperationType = operationType;
	}

	public int getStartSpan() {
		return startSpan;
	}

	public void setStartSpan(int startSpan) {
		this.startSpan = startSpan;
	}

	public int getEndSpan() {
		return endSpan;
	}

	public void setEndSpan(int endSpan) {
		this.endSpan = endSpan;
	}

	public SpannableStringBuilder getStringBuilder() {
		return stringBuilder;
	}

	public void setStringBuilder(SpannableStringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}

	public MultiActionTextviewClickListener getMultiActionTextviewClickListener() {
		return multiActionTextviewClickListener;
	}

	public void setMultiActionTextviewClickListener(
			MultiActionTextviewClickListener multiActionTextviewClickListener) {
		this.multiActionTextviewClickListener = multiActionTextviewClickListener;
	}

}
