package com.example.day38.branch;

import com.example.day38.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class TestJniBranchC extends Activity {

	static {
		System.loadLibrary("branch");
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b4_branch);
	}

	public void click(View view) {
		callC();
	}

	public native void callC();
}
