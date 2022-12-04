package com.bennyplo.graphics2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/**
 * Created by benlo on 09/05/2018.
 */

public class MyView extends View {
    private Paint redPaint;
    private Paint bluePaint;
    private Paint greenPaint;
    private Path mylines;


    public MyView(Context context) {
        super(context, null);
        //Add your initialisation code here
        redPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        redPaint.setStyle(Paint.Style.STROKE);//stroke only no fill
        redPaint.setColor(0xffff0000);//color red
        redPaint.setStrokeWidth(5);//set the line stroke width to 5

        bluePaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        bluePaint.setStyle(Paint.Style.STROKE);//stroke only no fill
        bluePaint.setColor(0xFF0000FF);//blue color
        bluePaint.setStrokeWidth(5);//set the line stroke width to 5

        greenPaint = new Paint();
        greenPaint.setARGB(255,0,255,0);

        mylines =new Path();
        /*
        mylines.moveTo(100,100);
        mylines.lineTo(150,200);
        mylines.lineTo(160,200);

        mylines.moveTo(160,200);
        mylines.lineTo(200,150);
        mylines.lineTo(210,150);

        mylines.moveTo(210,150);
        mylines.lineTo(250,250);
        mylines.lineTo(260,250);

        mylines.moveTo(260,250);
        mylines.lineTo(300,150);
        mylines.lineTo(310,150);
       */
      //  mylines.lineTo(250,250);
      //  mylines.lineTo(300,200);
       // mylines.lineTo(250,250);
       // mylines.lineTo(200,150);
       // mylines.lineTo(150,200);
       // mylines.moveTo(100,100);

        mylines.moveTo(50,300);
        mylines.lineTo(160,280);
        mylines.lineTo(300,380);
        mylines.lineTo(380,370);
        mylines.lineTo(280,450);
        mylines.lineTo(100,390);
        mylines.lineTo(160,380);
        mylines.lineTo(50,300);



    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Add your drawing code here
        canvas.drawRect(500,500,700,700,redPaint);

        canvas.drawCircle(600,600,145,redPaint);
        //canvas.drawCircle(500,450,50,redPaint);

        canvas.drawPath(mylines, greenPaint);
    }
}
