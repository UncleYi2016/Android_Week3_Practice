package com.example.week3practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MainActivity extends Activity {
	private static int i = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView t = (TextView) findViewById(R.id.textNumber);
		t.setText(Integer.toString(i));
		
		final Button btnPlus = (Button)findViewById(R.id.btnPlus);
		btnPlus.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				final TextView t = (TextView) findViewById(R.id.textNumber);
				t.setText(Integer.toString(++i));
			}
		});
		final Button btnMinus = (Button)findViewById(R.id.btnMinus);
		btnMinus.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				final TextView t = (TextView) findViewById(R.id.textNumber);
				t.setText(Integer.toString(--i));
				
			}
		});
		final Button btnReset = (Button)findViewById(R.id.btnReset);
		btnReset.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				final TextView t = (TextView) findViewById(R.id.textNumber);
				i = 0;
				t.setText(Integer.toString(i));
			}
		});
		final Button btnLogin = (Button)findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				EditText editName = (EditText)findViewById(R.id.editName);
				EditText editPwd = (EditText)findViewById(R.id.editPwd);
				String name = editName.getText().toString();
				String pwd = editPwd.getText().toString();
				String show = name + " - " + pwd;
				Toast.makeText(v.getContext(), show, Toast.LENGTH_SHORT).show();
			}
		});
		final CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
		checkBox.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Toast.makeText(v.getContext(), isChecked(checkBox), Toast.LENGTH_SHORT).show();
			}
			
			public String isChecked(CheckBox c){
				if(c.isChecked()){
					return "Checked!";
				}else{
					return "Unchecked!";
				}
			}
		});
	}
}
