package com.example.day38;

import com.example.day38.branch.TestJniBranchC;
import com.example.day38.cplusplus.TestJniCPlusPlus;
import com.example.day38.myview.TestMyView;
import com.example.day38.pressure.TestJniPressure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.day38_b1).setOnClickListener(this);
		findViewById(R.id.day38_b2).setOnClickListener(this);
		findViewById(R.id.day38_b3).setOnClickListener(this);
		findViewById(R.id.day38_b4).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.day38_b1:
			startActivity(new Intent(MainActivity.this, TestJniPressure.class));
			break;
		case R.id.day38_b2:
			startActivity(new Intent(MainActivity.this, TestMyView.class));
			break;
		case R.id.day38_b3:
			startActivity(new Intent(MainActivity.this, TestJniCPlusPlus.class));
			break;
		case R.id.day38_b4:
			startActivity(new Intent(MainActivity.this, TestJniBranchC.class));
			break;
		}
	}
}
