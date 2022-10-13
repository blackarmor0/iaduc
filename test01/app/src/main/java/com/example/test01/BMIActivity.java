package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.TextView;


public class BMIActivity extends AppCompatActivity {

    private EditText editTextHeight;
    private EditText editTextWeight;
    private TextView textTitle;
    private TextView textResult;
    float weight, height;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);
        editTextHeight = findViewById(R.id.chieucao);
        editTextWeight = findViewById(R.id.cannang);
        textTitle = findViewById(R.id.textView5);
        textResult= findViewById(R.id.ketqua);
        textTitle.setText(R.string.title);
        editTextHeight.setHint(R.string.height);
        editTextWeight.setHint(R.string.weight);
    }
    public void doViewResult(View v) {
        Resources rs = getResources();
        editTextHeight = findViewById(R.id.chieucao);
        editTextWeight = findViewById(R.id.cannang);
        height = (Float.parseFloat(editTextHeight.getText().toString())/100);
        weight = Float.parseFloat(editTextWeight.getText().toString());
        String results[]= rs.getStringArray(R.array.result);
        float calculate = (weight / (height * height));
        System.out.println(calculate);
        if(calculate < 18) {
            textResult.setText(results[0]);
        }
        else if(calculate < 24.9){
            textResult.setText(results[1]);
        }
        else if(calculate < 29.9){
            textResult.setText(results[2]);
        }
        else if(calculate < 34.9){
            textResult.setText(results[3]);
        }
        else{
            textResult.setText(results[4]);
        }

    }

}