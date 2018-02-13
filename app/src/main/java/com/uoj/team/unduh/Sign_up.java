package com.uoj.team.unduh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by G.Seelan on 1/30/2018.
 */



public class Sign_up extends AppCompatActivity {
    TextView  text1,text2,text3,text4,text5,text6,text7,text8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        text1=(TextView)findViewById(R.id.t1);
        text2=(TextView)findViewById(R.id.t2);
        text3=(TextView)findViewById(R.id.t3);
        text4=(TextView)findViewById(R.id.t4);
        text5=(TextView)findViewById(R.id.t5);
        text6=(TextView)findViewById(R.id.t6);
        text7=(TextView)findViewById(R.id.t7);
        text8=(TextView)findViewById(R.id.t8);

    }
    public void show(View view){
        text1.setVisibility(View.VISIBLE);
        text2.setVisibility(View.VISIBLE);
        text3.setVisibility(View.VISIBLE);
        text4.setVisibility(View.VISIBLE);
        text5.setVisibility(View.VISIBLE);
        text6.setVisibility(View.VISIBLE);
        text7.setVisibility(View.VISIBLE);
        text8.setVisibility(View.VISIBLE);
    }
}

