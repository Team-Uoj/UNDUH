package com.uoj.team.unduh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sign_in extends AppCompatActivity {
    TextView textsignup;
    Button btnsign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        textsignup = (TextView) findViewById(R.id.textsignup);
        btnsign_in=(Button)findViewById(R.id.sign_in);

       textsignup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(Sign_in.this, Sign_up.class);
               startActivity(intent);

           }
       });

        btnsign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gotohome();

            }
        });
    }
    public void Gotohome(){
        Intent intent = new Intent(Sign_in.this, Home.class);
        startActivity(intent);
    }

}


