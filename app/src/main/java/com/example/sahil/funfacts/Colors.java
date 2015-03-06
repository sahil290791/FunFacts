package com.example.sahil.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Sahil on 20-Dec-14.
 */
public class Colors {

    public String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    public int getColor(){
        int color = 0;
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(colors.length);
        int colorAsInt = Color.parseColor(colors[index]);
        return colorAsInt;
    }
}
