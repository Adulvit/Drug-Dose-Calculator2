package com.betagro.adulvitc.drugdosecalculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView titleTextView, detailTextView, detail2TextView;
    private Button backButton, nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final ImageView imageView = (ImageView) findViewById(R.id.imvIcon);
        final TextView titleTextView = (TextView) findViewById(R.id.txtTitle);
        TextView detailTextView = (TextView) findViewById(R.id.txtDetail);
        TextView detail2TextView = (TextView) findViewById(R.id.txtDetail2);
        Button backButton = (Button) findViewById(R.id.btnBack);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        // Show View

        int imageInts = getIntent().getIntExtra("Image", R.drawable.alfanor1);
        imageView.setImageResource(imageInts);

        final String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        String strDetail = getIntent().getStringExtra("Detail");
        detailTextView.setText(strDetail);

        //

        final int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.long_detail);
        detail2TextView.setText(detailStrings[intIndex]);


        Button nextButton = (Button) findViewById(R.id.btnNext);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (intIndex == 5 || intIndex == 6){
                    Intent intent1 = new Intent(DetailActivity.this, VitaminActivity.class);
                    intent1.putExtra("Title", intIndex);
                    intent1.putExtra("unit", intIndex);
                    intent1.putExtra("same_detail",intIndex);
                    startActivity(intent1);
                } else {
                    Intent intent = new Intent(DetailActivity.this, CalculateActivity.class);
                    intent.putExtra("Title", intIndex);
                    intent.putExtra("unit", intIndex);
                    intent.putExtra("same_detail",intIndex);
                    startActivity(intent);
                }

            }

        });

    }  //Main Method

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}  // Main Class
