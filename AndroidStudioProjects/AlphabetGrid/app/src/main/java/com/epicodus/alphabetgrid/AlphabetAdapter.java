package com.epicodus.alphabetgrid;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class AlphabetAdapter extends BaseAdapter {

    private Context mContext;
    private String[] mLetters;
    private Typeface mTypeface;


    public AlphabetAdapter (Context context, String[] letters, Typeface typeface){
        this.mContext = context;
        this.mLetters = letters;
        this.mTypeface = typeface;
    }

    @Override
    public int getCount() {
        return mLetters.length;
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
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            // get layout from xml file
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);


            // pull views
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);

            // set values into views
            letterView.setText(mLetters[i]);
            letterView.setTypeface(mTypeface);// using dummy data for now
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }
}
