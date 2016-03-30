package com.example.hegelund.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    private Button btn;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Byta activity
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
                // slut byta activity
            }
        });

        btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Byta activity
                Intent i = new Intent(MainActivity.this, Main22Activity.class);
                startActivity(i);
                // slut byta activity
            }
        });

        btn3 = (Button) findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Byta activity
                Intent i = new Intent(MainActivity.this, Main23Activity.class);
                startActivity(i);
                // slut byta activity
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
