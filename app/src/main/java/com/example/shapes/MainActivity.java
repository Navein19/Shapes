package com.example.shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3,e4,e5,e6,e7;

    public static double radius=0.0,l=0.0,b=0.0,stx=0.0,sty=0.0,sox=0.0,soy=0.0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button4);


        e1=findViewById(R.id.editText4);
        e2=findViewById(R.id.editText5);
        e3=findViewById(R.id.editText6);
        e4=findViewById(R.id.editText7);
        e5=findViewById(R.id.editText8);
        e6=findViewById(R.id.editText9);
        e7=findViewById(R.id.editText10);

        b1.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                radius = Double.parseDouble(e1.getText().toString());
                l = Double.parseDouble(e2.getText().toString());
                b = Double.parseDouble(e3.getText().toString());

                stx =Double.parseDouble(e4.getText().toString());
                sty =Double.parseDouble(e5.getText().toString());
                sox =Double.parseDouble(e6.getText().toString());
                soy =Double.parseDouble(e7.getText().toString());


                    Intent in = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(in);



            }
        });

}

}
