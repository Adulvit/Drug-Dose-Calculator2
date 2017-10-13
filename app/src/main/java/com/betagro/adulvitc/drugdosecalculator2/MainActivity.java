package com.betagro.adulvitc.drugdosecalculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView drugListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drugListView = (ListView) findViewById(R.id.listview);
        aboutMeButton = (Button) findViewById(R.id.btnABme);

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(intent);
            }
        });



        final int[] imageInts = new int[]{R.drawable.alfanor1,
                R.drawable.tenamoxin1, R.drawable.antibac1,
                R.drawable.oxybac501, R.drawable.ditrim,
                R.drawable.aquac, R.drawable.adekm};

        final String[] titleStrings = getResources().getStringArray(R.array.title);
        final String[] detailStrings = getResources().getStringArray(R.array.detail);

        MyAdapter myAdapter = new MyAdapter(this, imageInts, titleStrings, detailStrings);
        drugListView.setAdapter(myAdapter);

        drugListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("Detail", detailStrings[i]);
                intent.putExtra("Image", imageInts[i]);
                intent.putExtra("Index", i);
                intent.putExtra("Unit", i);
                startActivity(intent);
            }  // on Item click
        });


    }  // Main Method

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}  // Main Class
