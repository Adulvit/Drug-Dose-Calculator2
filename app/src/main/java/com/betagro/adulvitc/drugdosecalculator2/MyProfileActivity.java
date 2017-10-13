package com.betagro.adulvitc.drugdosecalculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    private Button BackButton;
    private TextView txtProfile1, txtProfile2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);


        txtProfile1 = (TextView) findViewById(R.id.txtDetail1);
        txtProfile2 = (TextView) findViewById(R.id.txtDetail2);
        BackButton = (Button) findViewById(R.id.btnBack);

        final int intIndex = getIntent().getIntExtra("my_profile",0);
        String[] profileStrings = getResources().getStringArray(R.array.my_profile);
        txtProfile1.setText(profileStrings[intIndex]);

        final int intIndex2 = getIntent().getIntExtra("my_profile",1);
        String[] profile2Strings = getResources().getStringArray(R.array.my_profile);
        txtProfile2.setText(profile2Strings[intIndex2]);


        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }  // Main Method


} // Main Class
