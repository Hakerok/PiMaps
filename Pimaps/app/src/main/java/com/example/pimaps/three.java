package com.example.pimaps;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class three extends Activity {
    Button down;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.three);
        down = (Button) findViewById(R.id.down);
        {
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.down:
                Intent intent = new Intent(this,two.class);
                startActivity(intent);
                break;
            default:
                break;


        }
    }
}
