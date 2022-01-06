package com.example.cointoss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        TextView textView=findViewById(R.id.receive);
        TextView textView1=findViewById(R.id.TV);

        Intent intent=getIntent();
        String str=intent.getStringExtra("TossChoice");

        Random rd=new Random();
        Boolean isHead=rd.nextBoolean();


        if(str.equals("Head"))
        {
            if(isHead)
            {
                textView.setText("You WON!");
                textView1.setText("It's a Head");
            }
            else
            {
                textView.setText("You LOSS!");
                textView1.setText("It's a Tail");
            }
        }
        else if(str.equals("Tail"))
        {
            if(isHead)
            {
                textView.setText("You LOSS!");
                textView1.setText("It's a Head");
            }
            else
            {
                textView.setText("You WON!");
                textView1.setText("It's a Tail");
            }
        }

    }
}