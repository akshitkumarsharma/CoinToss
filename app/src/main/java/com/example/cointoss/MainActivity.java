package com.example.cointoss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup=findViewById(R.id.radioGRP);
        Button tossBT=findViewById(R.id.tossCal);

        RadioButton tailBT=findViewById(R.id.tailBT);
        RadioButton headBT=findViewById(R.id.headBT);

        headBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Head is selected", Toast.LENGTH_SHORT).show();
            }
        });

        tailBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Tail is selected", Toast.LENGTH_SHORT).show();
            }
        });

        tossBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedID=radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton=findViewById(selectedID);

                if(selectedID==-1)
                {
                    Toast.makeText(MainActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String choice=radioButton.getText().toString();
                    Intent intent=new Intent(getApplicationContext(),FinalActivity.class);
                    intent.putExtra("TossChoice",choice);
                    startActivity(intent);
                }
            }
        });
    }
}