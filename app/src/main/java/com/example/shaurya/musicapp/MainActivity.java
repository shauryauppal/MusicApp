package com.example.shaurya.musicapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaplayer = MediaPlayer.create(this,R.raw.euphoria);
        Button play = (Button) findViewById(R.id.Play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Play Music", Toast.LENGTH_SHORT).show();

                mediaplayer.start();
            }
        });


        Button pause = (Button) findViewById(R.id.Pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Pause Music", Toast.LENGTH_SHORT).show();
                mediaplayer.pause();
            }
        });
    }



}
