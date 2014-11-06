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

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.BufferType;

/**
 * 
 * @author Ajay Sahani:
 * @seeA class which is responsible for handling multiple type of click on
 *       single TextView and use different color for text section on which we
 *       want click action.
 * 
 */
public class MultiActionTextView {

	public static void setSpannableText(TextView textView,
			SpannableStringBuilder stringBuilder, int highLightTextColor) {
		textView.setMovementMethod(LinkMovementMethod.getInstance());
		textView.setText(stringBuilder, BufferType.SPANNABLE);
		textView.setLinkTextColor(highLightTextColor);
	}

	/**
	 * 
	 * @param inputObject
	 *            :should not null Method responsible for creating click able
	 *            part in TextView without hyper link.
	 */
	public static void addActionOnTextViewWithLink(final InputObject inputObject) {
		inputObject.getStringBuilder().setSpan(
				new MultiActionTextViewClickableSpan(true) {
					@Override
					public void onClick(View widget) {
						inputObject.getMultiActionTextviewClickListener()
								.onTextClick(inputObject);
					}
				}, inputObject.getStartSpan(), inputObject.getEndSpan(),
				Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
	}

	/**
	 * 
	 * @param inputObject
	 *            :should not null Method responsible for creating click able
	 *            part in TextView with hyper link.
	 */
	public static void addActionOnTextViewWithoutLink(
			final InputObject inputObject) {
		inputObject.getStringBuilder().setSpan(
				new MultiActionTextViewClickableSpan(false) {
					@Override
					public void onClick(View widget) {
						inputObject.getMultiActionTextviewClickListener()
								.onTextClick(inputObject);
					}
				}, inputObject.getStartSpan(), inputObject.getEndSpan(),
				Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
	}

}
