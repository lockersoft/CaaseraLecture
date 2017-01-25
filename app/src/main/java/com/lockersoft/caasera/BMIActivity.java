package com.lockersoft.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    EditText edtHeight, edtWeight;
    TextView lblBMI, lblFatString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        edtHeight = (EditText) findViewById(R.id.edtHeight);
        edtWeight = (EditText) findViewById(R.id.edtWeight);
        lblBMI = (TextView) findViewById(R.id.txtBMI);
        lblFatString = (TextView) findViewById(R.id.lblFatString);
    }

    public void calculateOnClick(View v) {
        Log.i("BMI", "Calculate Button Clicked");
        // Get the height and weight
        Double height = Double.parseDouble(edtHeight.getText().toString());
        Double weight = Double.parseDouble(edtWeight.getText().toString());

        // Do the BMI Calc
        // (weight / (height * height)) * 703.0
        Double bmi = (weight / (height * height)) * 703.0;

        // Set the result into the BMI Text label
        lblBMI.setText(String.format("%.2f", bmi));
        lblFatString.setText("You are a big fatty ");
    }
}
