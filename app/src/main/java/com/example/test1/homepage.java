package com.example.test1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class homepage extends AppCompatActivity {
 private int prog =0;
 private Button incr;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ProgressBar progress_bar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
         progress_bar = (ProgressBar)  findViewById(R.id.progressBar2);
        incr = (Button) findViewById(R.id.button_incr);
       // drawerLayout=findViewById(R.id.drawer_layout);
        //drawerLayout=findViewById(R.id.nav_view);



        progress_bar.setProgress(0);

        incr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (prog<= 200){
                    prog+= 20;
                    progress_bar.setProgress(prog);

                }

            }
        });

        //ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        //drawerLayout.addDrawerListener(toggle);
        //toggle.syncState();
    }


}