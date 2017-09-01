package com.example.adulvitc.drugdosecalculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {

    private EditText volEditText, mbwEditText;
    private Button cal1Button, cal2Button, backButton;
    private TextView anwTextView,titleTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        final EditText volEditText = (EditText) findViewById(R.id.txtVolume);
        final EditText mbwEditText = (EditText) findViewById(R.id.txtMBW);
        Button cal1Button = (Button) findViewById(R.id.btnCal1);
        Button cal2Button = (Button) findViewById(R.id.btnCal2);
        final TextView anwTextView = (TextView) findViewById(R.id.txtAnswer);
        Button backButton = (Button) findViewById(R.id.btnBack1);

        cal1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(volEditText.getText().toString());
                double y = Integer.parseInt(mbwEditText.getText().toString());

                double result = (x * y) / 1000;
                anwTextView.setText(String.valueOf(result));

            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });





    }  //Main Method






}  //Main Class
