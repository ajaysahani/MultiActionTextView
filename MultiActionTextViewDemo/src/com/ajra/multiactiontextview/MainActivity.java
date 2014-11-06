package com.ajra.multiactiontextview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	private TextView textViewWithoutLink;
	private TextView textViewWithoutLinkFewClickable;
	private TextView textViewWithLink;
	private MyMultiActionClickListener myMultiActionClickListener;
	private final int NAME_CLICKED = 1;
	private final int ACTION_CLICKED = 2;
	private final int CONTENT_CLICKED = 3;
	private final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textViewWithoutLink = (TextView) findViewById(R.id.multi_action_textview);
		textViewWithoutLinkFewClickable = (TextView) findViewById(R.id.multi_action_textview_link_few);
		textViewWithLink = (TextView) findViewById(R.id.multi_action_textview_link);

		myMultiActionClickListener = new MyMultiActionClickListener();
		multiActionTextViewWithoutLinkALLClickable();
		multiActionTextViewWithoutLinkFewClickable();
		multiActionTextViewWithLink();
	}

	private void multiActionTextViewWithoutLinkALLClickable() {
		String name = "User Name";
		String action = "Action";
		String contentName = "Content  Name";
		SpannableStringBuilder stringBuilder = new SpannableStringBuilder();
		stringBuilder.append(name);
		stringBuilder.append(" ");
		stringBuilder.append(action);
		stringBuilder.append(" ");
		stringBuilder.append(contentName);
		int startSpan = 0;
		int endSpan = name.length();
		Log.d(TAG, " start : endspan::" + startSpan + " : " + endSpan);
		// name click
		InputObject nameClick = new InputObject();
		nameClick.setStartSpan(startSpan);
		nameClick.setEndSpan(endSpan);
		nameClick.setStringBuilder(stringBuilder);
		nameClick
				.setMultiActionTextviewClickListener(myMultiActionClickListener);
		nameClick.setOperationType(NAME_CLICKED);
		MultiActionTextView.addActionOnTextViewWithoutLink(nameClick);

		// action click
		endSpan = endSpan + 1;
		startSpan = endSpan;
		endSpan = endSpan + action.length();
		Log.d(TAG, " start : endspan::" + startSpan + " : " + endSpan);
		InputObject actionClick = new InputObject();
		actionClick.setStartSpan(startSpan);
		actionClick.setEndSpan(endSpan);
		actionClick.setStringBuilder(stringBuilder);
		actionClick
				.setMultiActionTextviewClickListener(myMultiActionClickListener);
		actionClick.setOperationType(ACTION_CLICKED);
		MultiActionTextView.addActionOnTextViewWithoutLink(actionClick);

		// content name click
		endSpan = endSpan + 1;
		startSpan = endSpan;
		endSpan = endSpan + contentName.length();
		Log.d(TAG, " start : endspan::" + startSpan + " : " + endSpan);
		InputObject contentClick = new InputObject();
		contentClick.setStartSpan(startSpan);
		contentClick.setEndSpan(endSpan);
		contentClick.setStringBuilder(stringBuilder);
		contentClick
				.setMultiActionTextviewClickListener(myMultiActionClickListener);
		contentClick.setOperationType(CONTENT_CLICKED);
		MultiActionTextView.addActionOnTextViewWithoutLink(contentClick);

		// final step
		MultiActionTextView.setSpannableText(textViewWithoutLink,
				stringBuilder, Color.RED);
	}

	private void multiActionTextViewWithoutLinkFewClickable() {
		String name = "User Name";
		String action = "Action";
		String contentName = "Content  Name";
		SpannableStringBuilder stringBuilder = new SpannableStringBuilder();
		stringBuilder.append(name);
		stringBuilder.append(" ");
		stringBuilder.append(action);
		stringBuilder.append(" ");
		stringBuilder.append(contentName);
		int startSpan = 0;
		int endSpan = name.length();
		Log.d(TAG, " start : endspan::" + startSpan + " : " + endSpan);
		// name click
		InputObject nameClick = new InputObject();
		nameClick.setStartSpan(startSpan);
		nameClick.setEndSpan(endSpan);
		nameClick.setStringBuilder(stringBuilder);
		nameClick
				.setMultiActionTextviewClickListener(myMultiActionClickListener);
		nameClick.setOperationType(NAME_CLICKED);
		MultiActionTextView.addActionOnTextViewWithoutLink(nameClick);

		// content name click
		endSpan = endSpan + 2+ action.length();
		startSpan = endSpan;
		endSpan = endSpan + contentName.length();
		Log.d(TAG, " start : endspan::" + startSpan + " : " + endSpan);
		InputObject contentClick = new InputObject();
		contentClick.setStartSpan(startSpan);
		contentClick.setEndSpan(endSpan);
		contentClick.setStringBuilder(stringBuilder);
		contentClick
				.setMultiActionTextviewClickListener(myMultiActionClickListener);
		contentClick.setOperationType(CONTENT_CLICKED);
		MultiActionTextView.addActionOnTextViewWithoutLink(contentClick);

		// final step
		MultiActionTextView.setSpannableText(textViewWithoutLinkFewClickable,
				stringBuilder, Color.RED);
	}

	private void multiActionTextViewWithLink() {
		String name = "User Name";
		String action = "Action";
		String contentName = "Content  Name";
		SpannableStringBuilder stringBuilder = new SpannableStringBuilder();
		stringBuilder.append(name);
		stringBuilder.append(" ");
		stringBuilder.append(action);
		stringBuilder.append(" ");
		stringBuilder.append(contentName);
		int startSpan = 0;
		int endSpan = name.length();
		Log.d(TAG, " start : endspan::" + startSpan + " : " + endSpan);
		// name click
		InputObject nameClick = new InputObject();
		nameClick.setStartSpan(startSpan);
		nameClick.setEndSpan(endSpan);
		nameClick.setStringBuilder(stringBuilder);
		nameClick
				.setMultiActionTextviewClickListener(myMultiActionClickListener);
		nameClick.setOperationType(NAME_CLICKED);
		MultiActionTextView.addActionOnTextViewWithLink(nameClick);

		// content name click
		endSpan = endSpan + 2+ action.length();
		startSpan = endSpan;
		endSpan = endSpan + contentName.length();
		Log.d(TAG, " start : endspan::" + startSpan + " : " + endSpan);
		InputObject contentClick = new InputObject();
		contentClick.setStartSpan(startSpan);
		contentClick.setEndSpan(endSpan);
		contentClick.setStringBuilder(stringBuilder);
		contentClick
				.setMultiActionTextviewClickListener(myMultiActionClickListener);
		contentClick.setOperationType(CONTENT_CLICKED);
		MultiActionTextView.addActionOnTextViewWithLink(contentClick);

		// final step
		MultiActionTextView.setSpannableText(textViewWithLink,
				stringBuilder, Color.RED);
	}

	class MyMultiActionClickListener implements
			MultiActionTextviewClickListener {

		@Override
		public void onTextClick(InputObject inputObject) {
			int operation = inputObject.getOperationType();
			String operationType = "";
			switch (operation) {
			case NAME_CLICKED:
				operationType = "Name Clicked";
				break;

			case ACTION_CLICKED:
				operationType = "Action Clicked";
				break;

			case CONTENT_CLICKED:
				operationType = "Content Clicked";
				break;

			}
			Toast.makeText(getApplicationContext(), operationType,
					Toast.LENGTH_LONG).show();
		}
	}
}
