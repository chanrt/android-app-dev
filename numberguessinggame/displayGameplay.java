package com.numberguessinggame.my.numberguessinggame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.Random;


public class displayGameplay extends ActionBarActivity {
    public final static String RANDNUM="com.numberguessinggame.my.numberguessinggame";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_gameplay);
        MediaPlayer curiosity=MediaPlayer.create(displayGameplay.this,R.raw.curiosity);
        curiosity.stop();
        MediaPlayer select= MediaPlayer.create(displayGameplay.this, R.raw.select);
        select.start();
        curiosity.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_gameplay, menu);
        return true;
    }
    public void advHelp(View view){
        MediaPlayer select=MediaPlayer.create(displayGameplay.this,R.raw.select);
        select.start();
        Intent intent=new Intent(this,AdvancedActivity.class);
        startActivity(intent);
    }

    public void randInt(View view){
        MediaPlayer select=MediaPlayer.create(displayGameplay.this,R.raw.select);
        select.start();
        Intent intent=new Intent(this,StartGame.class);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
