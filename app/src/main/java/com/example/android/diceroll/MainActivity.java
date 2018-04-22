package com.example.android.diceroll;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public int rollTheDice() {
        int diceRoll = (int) (Math.random() * 6 + 1);

        if (diceRoll == 0){

        } else{
            return diceRoll;
        }
        return diceRoll;
    }




    public void diceText(View view){
        TextView diceView = findViewById(R.id.diceView);
        diceView.setText("" + rollTheDice());
    }



































}
