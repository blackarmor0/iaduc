package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void doButtonChange(View v){
        TextView textView2=findViewById(R.id.textView4);

        EditText txtTitle=findViewById(R.id.editTextTextPersonName);
        EditText txtColor=findViewById(R.id.editTextTextPersonName2);
        int num = Integer.parseInt(txtColor.getText().toString());
        EditText txtSize=findViewById(R.id.editTextTextPersonName3);
        textView2.setText(txtTitle.getText());
        int number = Integer.parseInt(txtSize.getText().toString());
        textView2.setTextSize(number);
        if(num==0){
            textView2.setTextColor(Color.BLACK);
        }
        else if(num==1){
            textView2.setTextColor(Color.RED);
        }
        else if(num==2){
            textView2.setTextColor(Color.GREEN);
        }
        else if(num==3){
            textView2.setTextColor(Color.YELLOW);

        }


    }

    public void doButtonClose(View v){
        finish();
    }
}