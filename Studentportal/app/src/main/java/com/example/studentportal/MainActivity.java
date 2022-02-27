package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    EditText username;
    EditText password;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=findViewById(R.id.textView2);
        username=findViewById(R.id.editTextTextPersonName);
        password=findViewById(R.id.editTextTextPassword);
        button=findViewById(R.id.button);
        String name="malu";
        String pswrd="8558";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inname = username.getText().toString();
                String inpass = password.getText().toString();


                if(inname.isEmpty() || inpass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "fields are empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(inname.equals(name) && inpass.equals(pswrd))
                    {
                        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"login failed",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }
}