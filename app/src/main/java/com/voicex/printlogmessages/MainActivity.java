package com.voicex.printlogmessages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int random = new Random().nextInt(5);
        switch (random) {
            case 0:
                Log.i("NumberGenerated", "Function has generated zero.");
                break;
            case 1:
                Log.i("NumberGenerated", "Function has generated one.");
                break;
            case 2:
                Log.i("NumberGenerated", "Function has generated two.");
                break;
            case 3:
                Log.i("NumberGenerated", "Function has generated three.");
                break;
            case 4:
                Log.i("NumberGenerated", "Function has generated four.");
                break;
            case 5:
                Log.i("NumberGenerated", "Function has generated five.");
                break;
        }
    }
}