package com.betagro.adulvitc.drugdosecalculator2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Adulvitc on 28/8/2560.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int[] imageInt;
    public String[] titleStrings, detailStrings;

    public MyAdapter(Context context,
                     int[] imageInt,
                     String[] titleStrings,
                     String[] detailStrings) {
        this.context = context;
        this.imageInt = imageInt;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }
    @Override
    public int getCount() {
        return imageInt.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.activity_adapter, viewGroup, false);

        ImageView imageView = view1.findViewById(R.id.imvIcon);
        TextView titleTextView = view1.findViewById(R.id.txtTitle);
        TextView detailTextView = view1.findViewById(R.id.txtDetail);

        imageView.setImageResource(imageInt[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);

        return view1;
    }
}  //Main Class
