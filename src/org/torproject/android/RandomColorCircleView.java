package org.torproject.android;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class RandomColorCircleView extends View
{

	  private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

	  private float initX, initY, radius;
	  private boolean drawing = false;

		Random rand = new Random();
		

	public RandomColorCircleView(Context context) {
	 super(context);
	 // TODO Auto-generated constructor stub
	 init();
	 
	}

	public RandomColorCircleView(Context context, AttributeSet attrs) {
	 super(context, attrs);
	 init();
	}

	public RandomColorCircleView(Context context, AttributeSet attrs, int defStyle) {
	 super(context, attrs, defStyle);
	 
	 init();
	}

	private void init(){
	 paint.setStyle(Paint.Style.STROKE);
	 paint.setColor(Color.WHITE);
	 paint.setAntiAlias(false);
	 paint.setStrokeWidth(6);

	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
	   super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	   
	   setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec),
	   MeasureSpec.getSize(heightMeasureSpec));
	 
	}

	int a1 = 30;
	int a2 = 255;
	
	@Override
	protected void onDraw(Canvas canvas) {

		super.onDraw(canvas);
		
		for (int i = 0; i < 20; i++)
		{
			float r = rand.nextFloat()*255f;
			float g = rand.nextFloat()*255f;
			float b = rand.nextFloat()*255f;
	
			paint.setARGB(a1,(int)r,(int)g,(int)b);
		
			float x = rand.nextFloat() * getWidth();
			float y = rand.nextFloat() * getHeight();

			float w = rand.nextFloat() * getWidth();
			float h = rand.nextFloat() * getHeight();
			
			canvas.drawCircle(x, y, w/2, paint);
			
			
		}
		
	}
	
	int a1mod = 1;
	
	public void updateAlpha ()
	{
		a1 += a1mod;
		
		if (a1 > 255 || a1 < 0)
			a1mod *= -1;
		

	}

	/*
	@Override
	public boolean onTouchEvent(MotionEvent event) {
	 

	 int action = event.getAction();
	 if (action==MotionEvent.ACTION_MOVE){
	  float x = event.getX();
	  float y = event.getY();

	 // radius = (float) Math.sqrt(Math.pow(x-initX, 2) + Math.pow(y-initY, 2));
	  //updateAlpha();
	  
	     a1 = (int)(255*(y/((float)getHeight())));
	  
	 }
	 else if (action==MotionEvent.ACTION_DOWN){
	  initX = event.getX();
	  initY = event.getY();
	  radius = 1;
	  drawing = true;
	 
	  
	 }
	 else if (action==MotionEvent.ACTION_UP){
	  drawing = false;
	 
	  
	 }
	 
	 return true;
	 
	}*/

}