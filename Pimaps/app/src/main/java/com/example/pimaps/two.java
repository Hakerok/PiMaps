package com.example.pimaps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class two extends Activity {
    Button up;
    Button down;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.two);
        up = (Button) findViewById(R.id.up);
        down = (Button) findViewById(R.id.down);
        {
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.down:
                Intent intent = new Intent(this,one.class);
                startActivity(intent);
                break;
            default:
                break;
            case R.id.up:
                Intent intent1 = new Intent(this, three.class);
                startActivity(intent1);
                break;

        }
    }
}