package com.example.dragonne.myjourneytracker;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Dragonne on 26/04/2016.
 */
public class Graph extends View {
    public Graph(Context context, AttributeSet attrs){
        super(context,attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.Graph, 0, 0);
        try{

        } finally{
            a.recycle();
        }
    }
}
