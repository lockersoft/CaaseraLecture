package com.lockersoft.caasera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Landing1 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing1);
    }

    public void btnLoginOnClick(View v) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }

    public void btnFreeTrialOnClick( View v ){
        startActivity(new Intent(getApplicationContext(), FreeTrial.class));
        finish();
    }
}
