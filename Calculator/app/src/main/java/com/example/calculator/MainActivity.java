
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    float result = 0;


    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.edittext1);
        num2 = findViewById(R.id.edittext2);
        add = findViewById(R.id.button1);
        sub = findViewById(R.id.button2);
        mul = findViewById(R.id.button3);
        div = findViewById(R.id.button4);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                result = n1 + n2;
                Toast.makeText(MainActivity.this, "sum is" + result, Toast.LENGTH_SHORT).show();

            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                result = n1 - n2;
                Toast.makeText(MainActivity.this, "differenece  is" + result, Toast.LENGTH_SHORT).show();

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                result = n1 * n2;
                Toast.makeText(MainActivity.this, "product is" + result, Toast.LENGTH_SHORT).show();

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                result = n1 / n2;
                Toast.makeText(MainActivity.this, "division is" + result, Toast.LENGTH_SHORT).show();

            }
        });


    }


}