package com.example.day38.cplusplus;

import com.example.day38.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TestJniCPlusPlus extends Activity {
	static{
		System.loadLibrary("hello");
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b3_cplusplus);
	}

	public void click(View v){
		Toast.makeText(this, helloC(), 0).show();
	}
	
	public native String helloC();
}
