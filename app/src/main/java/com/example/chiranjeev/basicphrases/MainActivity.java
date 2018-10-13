package com.example.chiranjeev.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void englishToFrench(View view) {
        Button button = (Button) view;

        String tag = button.getTag().toString();

        setButtonSound(tag);

        startSound();
    }

    private void startSound() {
        mediaPlayer.start();
    }

    private void setButtonSound(String tag) {
        switch (tag) {
            case "dyse":
                mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                break;
            case "ge":
                mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
                break;
            case "h":
                mediaPlayer = MediaPlayer.create(this, R.raw.hello);
                break;
            case "hay":
                mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
                break;
            case "ili":
                mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
                break;
            case "mni":
                mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
                break;
            case "p":
                mediaPlayer = MediaPlayer.create(this, R.raw.please);
                break;
            default:
                mediaPlayer = MediaPlayer.create(this, R.raw.welcome);

        }
    }


}
