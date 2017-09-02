package com.example.adulvitc.drugdosecalculator2;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Instant;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView titleTextView,detailTextView, detail2TextView;
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

        final int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.long_detail);
        detail2TextView.setText(detailStrings[intIndex]);



        final String[] titleStrings = getResources().getStringArray(R.array.title);


        Button nextButton = (Button) findViewById(R.id.btnNext);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, CalculateActivity.class);
                intent.putExtra("Title", intIndex);
                startActivity(intent);
            }
        });

    }  //Main Method


}  // Main Class
