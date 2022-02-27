package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Button home;
    Button student;
    Button exam;
    Button result;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        home=findViewById(R.id.button2);
        student=findViewById(R.id.button3);
        exam=findViewById(R.id.button4);
        result=findViewById(R.id.button5);
        imageView=findViewById(R.id.imageView);


        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(i);

            }
        });

        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(j);

            }
        });


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(k);

            }
        });

    }
}