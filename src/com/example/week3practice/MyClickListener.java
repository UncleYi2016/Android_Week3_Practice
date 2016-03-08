package com.example.week3practice;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MyClickListener implements OnClickListener{

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(v.getContext(), "Button XXX", Toast.LENGTH_SHORT).show();
	}
	
}
