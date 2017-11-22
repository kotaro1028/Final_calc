package com.example.yoshikawaakira.final_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button onebt;
    Button twobt;
    Button threebt;
    Button fourbt;
    Button fivebt;
    Button sixbt;
    Button sevenbt;
    Button eightbt;
    Button ninebt;
    Button zerobt;
    Button addbt;
    Button subbt;
    Button multbt;
    Button dividebt;
    Button equalbt;
    TextView resultview;
    final int MAX_INPUT_LENGTH = 20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onebt = findViewById(R.id.one);
        twobt = findViewById(R.id.two);
        threebt = findViewById(R.id.three);
        fourbt = findViewById(R.id.four);
        fivebt = findViewById(R.id.five);
        sixbt = findViewById(R.id.six);
        sevenbt = findViewById(R.id.seven);
        eightbt = findViewById(R.id.eight);
        ninebt = findViewById(R.id.nine);
        zerobt = findViewById(R.id.zero);
        addbt = findViewById(R.id.add);
        subbt = findViewById(R.id.sub);
        multbt = findViewById(R.id.mult);
        dividebt = findViewById(R.id.divide);
        equalbt = findViewById(R.id.equal);
        resultview = findViewById(R.id.resultview);

        onebt.setOnClickListener(this);
        twobt.setOnClickListener(this);
        threebt.setOnClickListener(this);
        fourbt.setOnClickListener(this);
        fivebt.setOnClickListener(this);
        sixbt.setOnClickListener(this);
        sevenbt.setOnClickListener(this);
        eightbt.setOnClickListener(this);
        ninebt.setOnClickListener(this);
        zerobt.setOnClickListener(this);

        addbt.setOnClickListener(this);
        subbt.setOnClickListener(this);
        multbt.setOnClickListener(this);
        dividebt.setOnClickListener(this);
        equalbt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
            Button b = (Button) view;
            String text1 = b.getText().toString();
            resultview.append(text1);

            }
        }

