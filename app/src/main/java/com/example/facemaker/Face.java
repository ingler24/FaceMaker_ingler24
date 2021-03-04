package com.example.facemaker;
/**
 * @author Jonah Ingler
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;
import android.view.SurfaceView;

public class Face extends SurfaceView {

    //variables to randomize
    public int skinColor;
    public int eyeColor;
    public int hairColor;
    public int hairStyle;

    //different paints by part
    Paint facePaint = new Paint();
    Paint hairPaint = new Paint();
    Paint eyePaint = new Paint();

    //constructor
    public Face(Context context) {
        super(context);

        setWillNotDraw(false);

        //sets the background to white
        setBackgroundColor(Color.WHITE);
    }

    //randomizes the skinColor, eyeColor, and hairColor variables
    public void randomize(){

        //randomizes the following variables between 1 and 100
        skinColor = (int) (Math.random() * 100);
        eyeColor = (int) (Math.random() * 100);
        hairColor = (int) (Math.random() * 100);
        hairStyle = (int) (Math.random() * 100);

        //sets the style of the paints
        facePaint.setStyle(Paint.Style.FILL);
        hairPaint.setStyle(Paint.Style.FILL);
        eyePaint.setStyle(Paint.Style.FILL);

        //sets the skin color to one of three presets based off the random value
        if (skinColor%3 == 0) {
            facePaint.setColor(0xFFDBAC);
        }
        else if(skinColor%2 == 0) {
            facePaint.setColor(0xE0AC69);
        }
        else{
            facePaint.setColor(0x8D5524);
        }
    }

    //on draw method
    @Override
    public void onDraw(Canvas canvas) {
        randomize();
        canvas.drawOval(10f,10f, 110f, 110f, facePaint);
        drawHair(canvas);
        drawEyes(canvas);
    }

    //draws three different hair styles, with the given hairPaint color
    public void drawHair(Canvas canvas) {
        if (hairStyle%3 == 0){
            canvas.drawOval(10f, 10f, 110f, 30f, hairPaint);
        }
        else if (hairStyle%2 == 0){
            canvas.drawRect(10f, 10f, 110f, 30f, hairPaint);
        }
        else{
            canvas.drawOval(10f, 10f, 110f, 50f, hairPaint);
        }
    }

    //draws eyes, with the given eyePaint color
    public void drawEyes(Canvas canvas){
            canvas.drawOval(30f, 30f, 40f, 35f, eyePaint);
            canvas.drawOval(70f, 30f, 80f, 35f, eyePaint);
    }
}