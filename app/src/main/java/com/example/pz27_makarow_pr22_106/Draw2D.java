package com.example.pz27_makarow_pr22_106;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

public class Draw2D extends View {

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;
    Resources resources = getResources();
    int color;
    public Draw2D(Context context) {
        super(context);
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.logo);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);
        color = resources.getColor(R.color.tint,  null);
        // закрашиваем холст белым цветом
        mPaint.setColor(color);
        canvas.drawPaint(mPaint);
        // Рисуем жёлтый круг
        /*mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        // canvas.drawCircle(950, 30, 25, mPaint);
        canvas.drawCircle(width - 120, height - 2000, 100, mPaint);
        Log.d("height", Integer.toString(height));*/

        color = resources.getColor(R.color.brown,  null);
        mPaint.setColor(color);
        //  canvas.drawRect(20, 650, 950, 680, mPaint);
        canvas.drawRect(40, canvas.getHeight() - 800, width - 40, height-100, mPaint);
        color = resources.getColor(R.color.brown_bright,  null);
        mPaint.setColor(color);
        canvas.drawRect(70, canvas.getHeight() - 1000, width - 70, height-800, mPaint);
        color = resources.getColor(R.color.yellow,  null);
        mPaint.setColor(color);
        canvas.drawRect(100, canvas.getHeight() - 1200, width - 1200, height-1000, mPaint);
        canvas.drawRect(width - 1100, canvas.getHeight() - 1200, width - 950, height-1000, mPaint);
        color = resources.getColor(R.color.blue,  null);
        mPaint.setColor(color);
        canvas.drawCircle(width - 350, height - 500, 200, mPaint);
        canvas.drawCircle(width - 1100, height - 500, 200, mPaint);
        canvas.save();
        // Рисуем текст
        /*mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(32);
        //  canvas.drawText("Лужайка только для котов", 30, 648, mPaint);
        canvas.drawText("Лужайка только для котов", 30, height - 32, mPaint);*/

        // Текст под углом
        // int x = 810;
        /*int x = width - 170;
        int y = 190;

        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(27);
        String beam = "Лучик солнца!";

        canvas.save();
        // Создаём ограничивающий прямоугольник для наклонного текста
        // поворачиваем холст по центру текста
        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());

        // Рисуем текст
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(beam, x, y, mPaint);*/
        // восстанавливаем холст

        // Выводим изображение
        // canvas.drawBitmap(mBitmap, 450, 530, mPaint);
        Bitmap a = Bitmap.createScaledBitmap(mBitmap, 800, 800,true);
        canvas.drawBitmap(a, width - 800, height - 2400, mPaint);
    }
}
