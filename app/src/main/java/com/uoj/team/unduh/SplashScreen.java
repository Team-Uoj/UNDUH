package com.uoj.team.unduh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        iv=(ImageView) findViewById(R.id.iv);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.splashtransition);

        iv.startAnimation(myanim);
        final Intent i=new Intent(this,Sign_in.class);

        Thread timer=new Thread(){

            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}
