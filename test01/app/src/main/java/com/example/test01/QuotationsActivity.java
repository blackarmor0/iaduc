package com.example.test01;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuotationsActivity extends AppCompatActivity {
    private Button btnQuotation;
    private TextView txText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotations);

        btnQuotation = findViewById(R.id.button5);
        txText = findViewById(R.id.textView6);

//
//        ConstraintLayout layout1 = findViewById(R.id.layout1);


        btnQuotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double rd = Math.random() * 5 + 1;
                int ran = (int) rd;
                String s = onChange(ran);
                txText.setText(s);
            }
        });
    }

    private String onChange(int ran) {
        switch (ran) {
            case 0:
                txText.setTextColor(Color.parseColor("#FF0000"));
                txText.setTextSize(30);
                txText.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL);;
                return "Có công mài sát có ngày mõi tay";
            case 1:
                txText.setTextColor(Color.parseColor("#FFFF00"));
                txText.setTextSize(20);
                txText.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
                return "Có công mài sát có ngày mõi tay";
            case 2:
                txText.setTextColor(Color.parseColor("#FFBB86FC"));
                txText.setTextSize(10);
                txText.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL);
                return "Có công mài sát có ngày mõi tay";
            case 3:
                txText.setTextColor(Color.parseColor("#FF03DAC5"));
                txText.setTextSize(15);
                txText.setGravity(Gravity.TOP | Gravity.CENTER_VERTICAL);
                return "Có công mài sát có ngày mõi tay";
            case 4:
                txText.setTextColor(Color.parseColor("#FF3700B3"));
                txText.setTextSize(25);
                txText.setGravity(Gravity.NO_GRAVITY | Gravity.CENTER_VERTICAL);
                return "Có công mài sát có ngày mõi tay";
            default:
                return "làm cái gì đó cũng được!";
        }

    }

}
