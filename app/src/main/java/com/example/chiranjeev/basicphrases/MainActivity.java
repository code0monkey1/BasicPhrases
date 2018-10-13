package com.example.chiranjeev.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Step 1 : Set the gridLayout  by using the GridLayout widget and define the number of rows and columns
 * <p>
 * Step 2 : next put in a button , and define it's gravity as 1 , and same for the rowWeight =1 and columnWeight=1 ,
 * by doing this , the button will occupy 1 full unit in the layout ..
 * <p>
 * Step 3 : now make a common onClick method that will be the target of all buttons
 * <p>
 * Step 4 : In the declared buttons , in the place of the tags , put the names of the song titles as it is ( without extension )
 * <p>
 * Step 5 : now after casting out the button object that was pressed ,
 * extract it's name using getResources().getIdentifier and then put it as a parameter put in the name of the
 * song after extracting it .
 * the 2nd parameter "raw" is the name of the folder
 * and the 3rd param get's the packageName()
 */
public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Step 3 :
    public void englishToFrench(View view) {
        // Step 5 :

        Button button = (Button) view;

        mediaPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(button.getTag().toString(),
                        "raw",
                        getPackageName()));

        startSound();
    }

    private void startSound() {
        mediaPlayer.start();
    }


}
