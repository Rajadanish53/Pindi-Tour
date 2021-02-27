package com.example.pinditour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation fadein, fadeout, move, zoomin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(R.layout.activity_main);
        ImageView logo = findViewById(R.id.logo);
        TextView txt = findViewById(R.id.text);
        fadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
        fadein.setStartOffset(1400);
        fadeout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
        move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        logo.setAnimation(move);
        zoomin = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin);
        txt.setAnimation(fadein);
        
        Thread k = new Thread(){
            public void run(){
                try{
                    sleep(3*1000);
                    if(isNetworkAvailable()){
                        Intent gomain = new Intent(MainActivity.this,MainScreen.class);
                        startActivity(gomain);
                        finish();
                    }
                    else{
                        Intent error = new Intent(MainActivity.this,Error404.class);
                        startActivity(error);
                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        k.start();



    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}