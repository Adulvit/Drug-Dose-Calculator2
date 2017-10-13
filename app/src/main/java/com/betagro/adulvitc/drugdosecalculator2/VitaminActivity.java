package com.betagro.adulvitc.drugdosecalculator2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VitaminActivity extends AppCompatActivity {

    private EditText volEditText;
    private Button cal2Button, backButton;
    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin);

        final EditText volEditText= (EditText) findViewById(R.id.txtVolume);
        final Button cal2Button = (Button) findViewById(R.id.btnCal2);
        final Button backButton = (Button) findViewById(R.id.btnBack1);
        final TextView titleTextView = (TextView) findViewById(R.id.txtTitle2);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        final int intIndex2 = getIntent().getIntExtra("Title", 0);
        String[] titleStrings = getResources().getStringArray(R.array.title);
        titleTextView.setText(titleStrings[intIndex2]);

        final int intUnit = getIntent().getIntExtra("unit", 0);
        String[] unitStrings = getResources().getStringArray(R.array.unit);

        final int intSame = getIntent().getIntExtra("same_detail", 0);
        String[] sameStrings = getResources().getStringArray(R.array.same_detail);




        cal2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder ad = new AlertDialog.Builder(VitaminActivity.this);

                ad.setTitle("ผิดพลาด! ");
                ad.setIcon(R.drawable.icon_question);
                ad.setPositiveButton("Close", null);

                if (volEditText.getText().length() == 0 ) {
                    {
                        ad.setMessage("กรุณากรอกปริมาณอาหาร");
                        ad.show();
                        volEditText.requestFocus();
                        return;
                    }

                } else{

                    Intent intent = new Intent(VitaminActivity.this, ResultActivity.class);
                    intent.putExtra("Answer", volEditText.getText().toString());
                    intent.putExtra("unit", intUnit);
                    intent.putExtra("Title", intIndex2);
                    intent.putExtra("same_detail",intSame);
                    startActivity(intent);


                }
            }
        });


    }// Main Method


}// Main Class
