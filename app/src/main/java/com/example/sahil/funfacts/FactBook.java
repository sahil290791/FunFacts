package com.example.sahil.funfacts;

import java.util.Random;

/**
 * Created by Sahil on 20-Dec-14.
 */
public class FactBook {


    public String[] mFacts = {"Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult  you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };

    public String getFact() {
    String fact = "";
    Random randomGenerator = new Random();

    int randomNumber = randomGenerator.nextInt(mFacts.length);
    int[] colors = {0xff51b46d,0xffe0ab18,0xffe15258};

    fact = mFacts[randomNumber];
    return fact;
    }

}
