package com.betagro.adulvitc.drugdosecalculator2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class PhotoViewActivity extends AppCompatActivity {

    private PhotoView photoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_view);

        final PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);


        final int imageInts = getIntent().getIntExtra("image", R.drawable.alfanor1);
        photoView.setImageResource(imageInts);







    }  //Main Method



}  //Main Class
