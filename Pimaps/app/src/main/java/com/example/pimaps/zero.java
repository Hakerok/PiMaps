package com.example.pimaps;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class zero extends Activity {
    Button up;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.zero);
        up = (Button) findViewById(R.id.up);
        {
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.up:
                Intent intent = new Intent(this,one.class);
                startActivity(intent);
                break;
            default:
                break;


        }
    }
}