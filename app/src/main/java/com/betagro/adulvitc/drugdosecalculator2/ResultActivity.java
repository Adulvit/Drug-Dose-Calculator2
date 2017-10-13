package com.betagro.adulvitc.drugdosecalculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.betagro.adulvitc.drugdosecalculator2.R.array.title;

public class ResultActivity extends AppCompatActivity {

    // Initial Widget

    private TextView titleTextView3, AnswerTextView, AnswerTextView2, UnitTextView, SameTextView, Same2TextView;
    private Button backButton, finishButton;
    private Double ansNumbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Bind Widget

        TextView titleTextView3 = (TextView) findViewById(R.id.txtDrug);
        TextView AnswerTextView = (TextView) findViewById(R.id.txtAnswer);
        TextView AnswerTextView2 = (TextView) findViewById(R.id.txtAnswer2);
        TextView UnitTextView = (TextView) findViewById(R.id.txtUnit);
        TextView SameTextView = (TextView) findViewById(R.id.txtSame);

        Button backButton = (Button) findViewById(R.id.btnBack2);
        Button finishButton = (Button) findViewById(R.id.btnFinish);

        // Show View

        // Show Text drug
        int intIndex2 = getIntent().getIntExtra("Title", 0);
        String[] titleStrings = getResources().getStringArray(title);
        titleTextView3.setText(titleStrings[intIndex2]);

        // Show Text Unit
        int intIndex3 = getIntent().getIntExtra("unit", 0);
        String[] unitStrings = getResources().getStringArray(R.array.unit);
        UnitTextView.setText(unitStrings[intIndex3]);


        // Show Text same_detail
        int intSame = getIntent().getIntExtra("same_detail", 0);
        String[] sameStrings = getResources().getStringArray(R.array.same_detail);
        SameTextView.setText(sameStrings[intSame]);

        // show Text Answer
        Intent _inboundIndex = getIntent();
        String answer = _inboundIndex.getStringExtra("Answer");

        double ansNumber = Double.parseDouble(answer);
        /*int ansNumber = Integer.parseInt(answer);*/



        if (intIndex2 == 0) {
            if (ansNumber > 20) {
                double a = 0.05 * ansNumber;
                int aa = (int) a;
                AnswerTextView.setText(String.valueOf(aa));
                double b = 0.10 * ansNumber;
                int bb = (int) b;
                AnswerTextView2.setText(String.valueOf(bb));
            }else if (ansNumber <= 20){
                double aaa = 0.05 * ansNumber;
                AnswerTextView.setText(String.valueOf(aaa));
                double bbb = 0.10 * ansNumber;
                AnswerTextView2.setText(String.valueOf(bbb));
            }
        } else if (intIndex2 == 1) {
            if (ansNumber > 10) {
                double c = 0.12 * ansNumber;
                int cc = (int) c;
                AnswerTextView.setText(String.valueOf(cc));
                double d = 0.20 * ansNumber;
                int dd = (int) d;
                AnswerTextView2.setText(String.valueOf(dd));
            }else if (ansNumber <= 10){
                double ccc = 0.12 * ansNumber;
                AnswerTextView.setText(String.valueOf(ccc));
                double ddd = 0.20 * ansNumber;
                AnswerTextView2.setText(String.valueOf(ddd));
            }
        } else if (intIndex2 == 2) {
            if (ansNumber > 11) {
                double e = 0.10 * ansNumber;
                int ee = (int) e;
                AnswerTextView.setText(String.valueOf(ee));
                double f = 0.17 * ansNumber;
                int ff = (int) f;
                AnswerTextView2.setText(String.valueOf(ff));
            }else if (ansNumber <= 11){
                double eee = 0.10 * ansNumber;
                AnswerTextView.setText(String.valueOf(eee));
                double fff = 0.17 * ansNumber;
                AnswerTextView2.setText(String.valueOf(fff));
            }

        } else if (intIndex2 == 3) {
            if (ansNumber > 10) {
                double g = 0.12 * ansNumber;
                int gg = (int) g;
                AnswerTextView.setText(String.valueOf(gg));
                double h = 0.20 * ansNumber;
                int hh = (int) h;
                AnswerTextView2.setText(String.valueOf(hh));
            }else if (ansNumber <= 10){
                double ggg = 0.12 * ansNumber;
                AnswerTextView.setText(String.valueOf(ggg));
                double hhh = 0.20 * ansNumber;
                AnswerTextView2.setText(String.valueOf(hhh));
            }

        } else if (intIndex2 == 4 ) {
            if (ansNumber > 11) {
                double i = 0.10 * ansNumber;
                int ii = (int) i;
                AnswerTextView.setText(String.valueOf(ii));
                double j = 0.17 * ansNumber;
                int jj = (int) j;
                AnswerTextView2.setText(String.valueOf(jj));
            }else if (ansNumber <= 11){
                double iii = 0.10 * ansNumber;
                AnswerTextView.setText(String.valueOf(iii));
                double jjj = 0.17 * ansNumber;
                AnswerTextView2.setText(String.valueOf(jjj));
            }

        } else if (intIndex2 == 5) {
            double k = 3.0 * ansNumber;
            int kk = (int) k;
            AnswerTextView.setText(String.valueOf(kk));
            double l = 5.0 * ansNumber;
            int ll = (int) l;
            AnswerTextView2.setText(String.valueOf(ll));
        } else if (intIndex2 == 6) {
            double m = 1.0 * ansNumber;
            int mm = (int) m;
            AnswerTextView.setText(String.valueOf(mm));
            double n = 2.0 * ansNumber;
            int nn = (int) n;
            AnswerTextView2.setText(String.valueOf(nn));

        } else {
            AnswerTextView.setText(String.valueOf(false));
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }  //Main Method

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}  //Main Class
