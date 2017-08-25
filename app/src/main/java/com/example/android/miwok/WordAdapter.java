package com.example.android.miwok;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nishant on 19/12/16.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int resourceColourId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colourId) {
        super(context, 0, words);
        resourceColourId=colourId;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list= convertView;
        if(list==null)
        {
            list= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        final Word wordadap=getItem(position);

        TextView t=(TextView)list.findViewById(R.id.english_textview);
        t.setText(wordadap.getEngWords());

        TextView t1=(TextView)list.findViewById(R.id.miwok_textview);
        t1.setText(wordadap.getMiwokWords());

        ImageView i=(ImageView)list.findViewById(R.id.image_word);

        ImageView button=(ImageView) list.findViewById(R.id.play_button);
        if(wordadap.imageset()==true)
        {
            i.setImageResource(wordadap.getResourceId());
            i.setVisibility(View.VISIBLE);
            button.setImageResource(R.drawable.ic_play_circle_filled_white_24dp);
        }
        else
        {
            i.setVisibility(View.GONE);
            button.setImageResource(R.drawable.ic_play_circle_filled_white_24dp);
        }

        View textC = list.findViewById(R.id.text_box);
        int color= ContextCompat.getColor(getContext(),resourceColourId);
        textC.setBackgroundColor(color);

        return list;
    }


}
