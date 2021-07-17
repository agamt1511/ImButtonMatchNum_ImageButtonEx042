package com.example.imbuttonmatchnum_imagebuttonex042;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton ib;
    Random rnd = new Random();
    int hagrla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        ib = (ImageButton) findViewById(R.id.ib);
    }

    public void showing(View view) {
        rnd = new Random();
        hagrla = rnd.nextInt(3);
        hagrla++;

        if (hagrla == 1) {
            iv.setImageResource(R.drawable.pasta1);
            ib.setImageResource(R.drawable.numone);
        }
        else if (hagrla == 2) {
            iv.setImageResource(R.drawable.pizza);
            ib.setImageResource(R.drawable.numtwo);
        }
        else  {
            iv.setImageResource(R.drawable.lasagna);
            ib.setImageResource(R.drawable.numthree);
        }


    }
}