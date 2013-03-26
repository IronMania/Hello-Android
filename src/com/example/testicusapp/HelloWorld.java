package com.example.testicusapp;

import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorld extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.button1);
		
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				EditText input = (EditText) findViewById(R.id.editText1);
				TextView outPut = (TextView) findViewById(R.id.textView1);
				outPut.setText("Hello " + input.getText() + "!");

			}
		}

		);

	}

}
