package com.lockersoft.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Landing1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing1);
    }

    public void btnLoginOnClick(View v) {
        finish();
    }
}
