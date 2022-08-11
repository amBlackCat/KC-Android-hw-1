package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Title = findViewById(R.id.title);
        TextView total = findViewById(R.id.total);
        TextView Result = findViewById(R.id.result);

        EditText Quizes = findViewById(R.id.eTxt);
        EditText HomeWorks = findViewById(R.id.eTxt2);
        EditText MidTerms = findViewById(R.id.eTxt3);
        EditText Final = findViewById(R.id.eTxt4);

        Button Calculate = findViewById(R.id.buttonCalc);
        Button Reset = findViewById(R.id.buttonReset);




        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            int num1 = Integer.parseInt(Quizes.getText().toString());
            int num2 = Integer.parseInt(HomeWorks.getText().toString());
            int num3 = Integer.parseInt(MidTerms.getText().toString());
            int num4 = Integer.parseInt(Final.getText().toString());


            int num5 = 15;
            int num6 = 25;
            int num7 = 30;
            int num8 = 100;


            int a = num1 * num5 /num8;
            int b = num2 * num6 /num8;
            int c = num3 * num7 /num8;
            int d = num4 * num7 /num8;


            int result = a + b + c + d;


            Result.setText(String.valueOf("%"+result));

            }
        });





           Reset.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {


                   Quizes.getText().clear();
                   HomeWorks.getText().clear();
                   MidTerms.getText().clear();
                   Final.getText().clear();


               }
           });

    }
}