package com.example.day38.pressure;

import com.example.day38.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class TestJniPressure extends Activity {
	private ProgressBar pb;
	private MyProgressBar myPrb;
	static{
		System.loadLibrary("pressure");
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b1_pressure);
		pb = (ProgressBar) findViewById(R.id.pb);
		pb.setMax(100);
		myPrb = (MyProgressBar) findViewById(R.id.prb_myPrb);
		myPrb.setMax(100);
	}

	public void start(View v) {
		new Thread() {
			public void run() {
				startMonitor();
			};
		}.start();
	}

	public void stop(View v) {
		stopMonitor();
	}

	public native void startMonitor();

	public native void stopMonitor();

	public void show(int pressure) {
		pb.setProgress(pressure);
		myPrb.setPressure(pressure);
	}
}
