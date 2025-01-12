package com.example.kazakov;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void calculateSegments(View v) {
        EditText inputFieldA = findViewById(R.id.inputFieldA);
        EditText inputFieldB = findViewById(R.id.inputFieldB);
        EditText inputFieldC = findViewById(R.id.inputFieldC);
        TextView resultField = findViewById(R.id.resultField);


        String inputA = inputFieldA.getText().toString();
        String inputB = inputFieldB.getText().toString();
        String inputC = inputFieldC.getText().toString();




            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            double c = Double.parseDouble(inputC);


            double ac = Math.abs(a - c);
            double bc = Math.abs(b - c);
            double sum = ac + bc;

            resultField.setText(String.format("AC = %.2f\nBC = %.2f\nСумма = %.2f", ac, bc, sum));

    }
}
