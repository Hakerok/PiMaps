package com.example.pimaps;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;


public class o_programme  extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.o_programme);
    }
}
