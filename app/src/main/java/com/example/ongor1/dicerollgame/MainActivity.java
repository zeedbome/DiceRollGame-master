package com.example.ongor1.dicerollgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    ImageView image3;
    public void roll(View v){

        Random rand = new Random();
        int val1 = rand.nextInt(6) + 1;
        int val2 = rand.nextInt(6) + 1;
        int val3 = rand.nextInt(6) + 1;

        if (val1 == 1)
            image1.setImageResource(R.drawable.dice1);
        else if (val1 == 2)
            image1.setImageResource(R.drawable.dice2);
        else if (val1 == 3)
            image1.setImageResource(R.drawable.dice3);
        else if (val1 == 4)
            image1.setImageResource(R.drawable.dice4);
        else if (val1 == 5)
            image1.setImageResource(R.drawable.dice5);
        else if (val1 == 6)
            image1.setImageResource(R.drawable.dice6);
        if (val2 == 1)
            image2.setImageResource(R.drawable.dice1);
        else if (val2 == 2)
            image2.setImageResource(R.drawable.dice2);
        else if (val2 == 3)
            image2.setImageResource(R.drawable.dice3);
        else if (val2 == 4)
            image2.setImageResource(R.drawable.dice4);
        else if (val2 == 5)
            image2.setImageResource(R.drawable.dice5);
        else if (val2 == 6)
            image2.setImageResource(R.drawable.dice6);

        if (val3 == 1)
            image3.setImageResource(R.drawable.dice1);
        else if (val3 == 2)
            image3.setImageResource(R.drawable.dice2);
        else if (val3 == 3)
            image3.setImageResource(R.drawable.dice3);
        else if (val3 == 4)
            image3.setImageResource(R.drawable.dice4);
        else if (val3 == 5)
            image3.setImageResource(R.drawable.dice5);
        else if (val3 == 6)
            image3.setImageResource(R.drawable.dice6);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=(ImageView)findViewById(R.id.imageView1);
        image2=(ImageView)findViewById(R.id.imageView2);
        image3=(ImageView)findViewById(R.id.imageView3);
    }
}
