package com.example.day38.pressure;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyProgressBar extends View {
	private int pressure;
	private int max;

	public void setPressure(int pressure) {
		this.pressure = pressure;
//		invalidate();//使当前视图无效，如果当前视图是可见的，那么onDraw会调用，只能在主线程调用
		postInvalidate();
	}

	public void setMax(int max) {
		this.max = max;
	}

	public MyProgressBar(Context context) {
		super(context);
	}

	public MyProgressBar(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint = new Paint();

		if(pressure<50){
			paint.setColor(Color.GREEN);
		}else if(pressure <80){
//			paint.setColor(android.R.color.holo_orange_dark);//版本问题，所以直接写资源码
			paint.setColor(0xffff8800);
		}else{
			paint.setColor(Color.RED);
		}
		
		canvas.drawRect(10, 10 + max - pressure, 30, 10 + max, paint);
	}
}
