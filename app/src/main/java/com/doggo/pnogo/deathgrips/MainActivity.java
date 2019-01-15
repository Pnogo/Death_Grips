package com.doggo.pnogo.deathgrips;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;
import java.util.Random;



public class MainActivity extends AppCompatActivity {

    static MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }


    /*public void sas(){                                      //metodo che dovrebbe cambiare foto al tasto (messo qui a caso)
        ImageButton imgView = new ImageButton(this);
        Random rand = new Random();
        int rndInt = rand.nextInt(2) + 1; // n = the number of images, that start at idx 1
        String imgName = "img" + rndInt;
        int id = getResources().getIdentifier(imgName, "drawable", getPackageName());
        imgView.setImageResource(id);
    }
    */
    public void onMusicStart(View view) throws IOException {
        mediaPlayer = MediaPlayer.create(this, R.raw.summertimeme);
        if(mediaPlayer.isPlaying())
            mediaPlayer.stop();
        else
            mediaPlayer.start();
    }

    public void onMusicStartTwo(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.yuh);
        mediaPlayer.start();
    }

    public void onMusicStop(View view) throws IOException {
        mediaPlayer.stop();
    }
    public void onBackPressed() {
        mediaPlayer.stop();
    }

    public void goToURL(View view) {
        Uri uri = Uri.parse("https://pnogo.github.io"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
