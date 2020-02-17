package com.example.shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    MainActivity m1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        m1=new MainActivity();
    setContentView(new myview(this));


    }

    private class myview extends View {
        public myview(Context context) {
            super(context);
        }

        @Override

        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setTextSize(40);
            paint.setColor(Color.GREEN);
            canvas.drawText("Circle", 500+(float)m1.radius, 500+(float)m1.radius, paint);

            paint.setColor(Color.RED);
            canvas.drawCircle(500, 500, (float)m1.radius, paint);
            paint.setColor(Color.GREEN);
            canvas.drawText("Rectangle", 255, 50, paint);
            paint.setColor(Color.YELLOW);
            canvas.drawRect(250, 50, 250+(float)m1.l, 50+(float)m1.b, paint);
            paint.setColor(Color.GREEN);
            canvas.drawText("SQUARE", 800, 800, paint);
            paint.setColor(Color.BLUE);
            canvas.drawRect(800, 800, 800+(float)m1.l, 800+(float)m1.l, paint);
            paint.setColor(Color.GREEN);
            canvas.drawText("LINE", (float)m1.sox, (float)m1.soy, paint);
            paint.setColor(Color.BLACK);

            canvas.drawLine((float)m1.stx, (float)m1.sty, (float)m1.sox, (float)m1.soy, paint);


        }
    }
}
