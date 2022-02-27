package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.examplemenu,menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:

                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
                return true;

            case R.id.item2:

                Intent i1=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(i1);
                return true;



            case R.id.item3:

                Intent i2=new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(i2);
                return true;

            case R.id.item4:
                Toast.makeText(MainActivity.this, "item4 selected", Toast.LENGTH_SHORT).show();


            case R.id.item5:
                Toast.makeText(MainActivity.this, "item5 selected", Toast.LENGTH_SHORT).show();


        }
        return super.onOptionsItemSelected(item);
    }
}
