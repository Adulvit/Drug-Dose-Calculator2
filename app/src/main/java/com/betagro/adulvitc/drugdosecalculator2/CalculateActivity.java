package com.betagro.adulvitc.drugdosecalculator2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {

    private EditText volEditText, mbwEditText;
    private Button cal1Button, cal2Button, backButton;
    private TextView anwTextView, titleTextView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        final EditText volEditText = (EditText) findViewById(R.id.txtVolume);
        final EditText mbwEditText = (EditText) findViewById(R.id.txtMBW);
        final Button cal1Button = (Button) findViewById(R.id.btnCal1);
        final TextView anwTextView = (TextView) findViewById(R.id.txtAnswer);
        final TextView titleTextView2 = (TextView) findViewById(R.id.txtTitle2);


        Button backButton = (Button) findViewById(R.id.btnBack1);

        cal1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                final AlertDialog.Builder ad = new AlertDialog.Builder(CalculateActivity.this);

                ad.setTitle("ผิดพลาด! ");
                ad.setIcon(R.drawable.icon_question);
                ad.setPositiveButton("Close", null);

                if (volEditText.getText().length() == 0 || mbwEditText.getText().length() == 0) {
                    {
                        ad.setMessage("กรุณากรอกจำนวนปลาและน้ำหนักเฉลี่ย");
                        ad.show();
                        volEditText.requestFocus();
                        return;
                    }

                } else {
                    double x = Integer.parseInt(volEditText.getText().toString());
                    double y = Double.parseDouble(mbwEditText.getText().toString());
                    double z = (x * y) / 1000;

                    anwTextView.setText(String.valueOf(z));

                }
            }


        });


        // Show View
        // Real Show-Title show
        final int intIndex2 = getIntent().getIntExtra("Title", 0);
        String[] titleStrings2 = getResources().getStringArray(R.array.title);
        titleTextView2.setText(titleStrings2[intIndex2]);

        // Dummy Show-Unit show
        final int intUnit = getIntent().getIntExtra("unit", 0);
        String[] unitStrings = getResources().getStringArray(R.array.unit);

        final int intSame = getIntent().getIntExtra("same_detail", 0);
        String[] sameStrings = getResources().getStringArray(R.array.same_detail);



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        Button cal2Button = (Button) findViewById(R.id.btnCal2);
        cal2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final AlertDialog.Builder ad = new AlertDialog.Builder(CalculateActivity.this);

                ad.setTitle("ผิดพลาด! ");
                ad.setIcon(R.drawable.icon_question);
                ad.setPositiveButton("Close", null);


                if (anwTextView.getText().length() == 0) {
                    ad.setMessage("กรุณาคำนวณค่าน้ำหนักรวม");
                    ad.show();
                    anwTextView.requestFocus();
                    return;
                } else {
                    Intent intent = new Intent(CalculateActivity.this, ResultActivity.class);
                    intent.putExtra("Answer", anwTextView.getText().toString());
                    intent.putExtra("Title", intIndex2);
                    intent.putExtra("unit", intUnit);
                    intent.putExtra("same_detail",intSame);
                    startActivity(intent);

                }

            }
        });


    }  //Main Method

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}  //Main Class


