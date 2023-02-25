package com.example.test1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;


public class homepage extends AppCompatActivity {
 private int prog =0;
 private Button incr;
    ProgressBar progress_bar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
         progress_bar = (ProgressBar)  findViewById(R.id.progressBar2);
        incr = (Button) findViewById(R.id.button_incr);

        progress_bar.setProgress(0);
        Toast.makeText(getApplicationContext(), ""+progress_bar.getProgress(), Toast.LENGTH_LONG).show();
        incr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (prog<= 200){
                    prog+= 20;
                    progress_bar.setProgress(prog);

                }

            }
        });

    }

}