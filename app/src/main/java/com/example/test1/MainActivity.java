package com.example.test1;

import android.content.Intent;
import android.security.identity.IdentityCredentialException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button button;
EditText TextName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button_con);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhomepage();

                    String nom = TextName.getText().toString();
                    if (!nom.equals("")) {
                        Toast.makeText(getApplicationContext(), "Bienvenue " + nom, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "nom et obligatoire", Toast.LENGTH_LONG).show();
                    }




            }
        });
    }
public void openhomepage(){
      Intent intent= new Intent(this,homepage.class);
      startActivity(intent);
}
}