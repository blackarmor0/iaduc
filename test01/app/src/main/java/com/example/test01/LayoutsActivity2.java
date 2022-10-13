package com.example.test01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class LayoutsActivity2 extends AppCompatActivity {
    private ImageView imgView;
    private Button btn;
    private Boolean isTurnOn = false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts2);
        btn = findViewById(R.id.button);
        btn.setText("TURN ON");
    }
    public void onClickImage (View v){
        int id = v.getId();
        imgView = findViewById(id);
        if(!isTurnOn){
            imgView.setImageResource(R.drawable.circle2);
            isTurnOn= true;
        }
        else {
            imgView.setImageResource(R.drawable.circle);
            isTurnOn= false;
        }

    };
    public void onClickTurnOnAll(View v) {
        ArrayList<ImageView> imgViews  =  new ArrayList<>();
        imgViews.add(findViewById(R.id.imageView1));
        imgViews.add(findViewById(R.id.imageView2));
        imgViews.add(findViewById(R.id.imageView3));
        imgViews.add(findViewById(R.id.imageView4));
        imgViews.add(findViewById(R.id.imageView5));
        imgViews.add(findViewById(R.id.imageView6));
        imgViews.add(findViewById(R.id.imageView5));
        imgViews.add(findViewById(R.id.imageView9));

        if(!isTurnOn){
            isTurnOn = true;
            btn.setText("TURN OFF");
            for(int i =0 ; i < imgViews.size(); i++){
                imgViews.get(i).setImageResource(R.drawable.circle2);
            }
        }
        else {
            isTurnOn= false;
            btn.setText("TURN ON");
            for(int i =0 ; i < imgViews.size(); i++){
                imgViews.get(i).setImageResource(R.drawable.circle);
            }
        }
    }
}