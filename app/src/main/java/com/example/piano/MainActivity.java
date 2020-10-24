package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void play (View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.pianoa);
        mp.start();
    }
}