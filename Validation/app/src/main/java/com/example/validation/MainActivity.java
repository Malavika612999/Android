package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    EditText phone;
    EditText password;
    Button submit;

    Pattern name_PATTERN = Pattern.compile("^[A-Za-z]\\w{3,30}$");


    Pattern PASSWORD_PATTERN = Pattern.compile("^" +
            "(?=.*[@#$%^&+=])" +         // at least 1 special character
            "(?=\\S+$)" +               // no white spaces
            ".{4,}" +                  // at least 4 characters
            "$");
    Pattern Phone_PATTERN = Pattern.compile("^" +

            "(?=\\S+$)" +                    // no white spaces
            "[0-9]{10,10}" +                // 10 numbers
            "$");
    Pattern Age_PATTERN = Pattern.compile("^" +

            "(?=\\S+$)" +                  // no white spaces
            "[0-9]{1,2}" +                // 2 numbers
            "$");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextTextPersonName4);
        age = findViewById(R.id.editTextTextPersonName5);
        phone = findViewById(R.id.editTextTextPersonName6);
        password = findViewById(R.id.editTextTextPassword3);
        submit = findViewById(R.id.button2);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName = name.getText().toString();
                String inpAge = age.getText().toString();
                String inpPh = phone.getText().toString();
                String inpPass = password.getText().toString();


                if (inpName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Name Field is Empty", Toast.LENGTH_SHORT).show();
                } else if (inpAge.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Age field is Empty", Toast.LENGTH_SHORT).show();
                } else if (inpPh.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Phone field is Empty", Toast.LENGTH_SHORT).show();
                } else if (inpPass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Pass field is Empty", Toast.LENGTH_SHORT).show();
                } else if (!name_PATTERN.matcher(inpName).matches()) {
                    name.setError("Incorrect Name");
                } else if (!Age_PATTERN.matcher(inpAge).matches()) {
                    age.setError("Incorrect Age");
                } else if (!Phone_PATTERN.matcher(inpPh).matches()) {
                    phone.setError("Invalid Phone Number");
                } else if (!PASSWORD_PATTERN.matcher(inpPass).matches()) {
                    password.setError("Weak Password");
                } else {
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}