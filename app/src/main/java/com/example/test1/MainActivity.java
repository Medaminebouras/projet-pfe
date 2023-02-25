package com.example.test1;

import static com.example.test1.R.id.button_con;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.test1.ui.LoginTask;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    private TextView Erreurmessage;
    private EditText TextName;
    private EditText TextPassword;
    private Button button_con;
    Button button;
    EditText t;
    Toolbar toolbar;
    String res = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button_con);
        t = (EditText) findViewById(R.id.TextName);
        Erreurmessage=findViewById(R.id.Erreurmessage);
        LoginTask dbTask = new LoginTask();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s =dbTask.execute("xcfd","password").get();
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                openhomepage();
                String nom = t.getText().toString();
                if (!nom.equals("")) {
                    Toast.makeText(getApplicationContext(), "Bienvenue " + nom, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "nom est obligatoire", Toast.LENGTH_LONG).show();
                }
            }
        });
    }



    public void openhomepage() {
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }
}