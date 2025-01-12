package com.example.kazakov;

import static android.os.Build.VERSION_CODES.S;

import static java.lang.Math.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


    public void calculatePerimeter(View v) {
        EditText inputFieldD = findViewById(R.id.inputFieldD);

        TextView resultField = findViewById(R.id.resultField);


        String inputD = inputFieldD.getText().toString();




        double d = Double.parseDouble(inputD);


        double L =PI*d;



        resultField.setText(String.format("L =%.2f ",L));
    }
}
