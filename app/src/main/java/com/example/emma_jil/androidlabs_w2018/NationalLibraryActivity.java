package com.example.emma_jil.androidlabs_w2018;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NationalLibraryActivity extends Activity {

    protected static final String ACTIVITY_NAME = "NationalLibraryActivity";
    Button loginB;
    Button registerB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_library);

        loginB = (Button)findViewById(R.id.LoginButton);
        loginB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(NationalLibraryActivity.this, StartActivity.class);

                Context c = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(c, R.string.LibraryLoginResult, duration);
                toast.show();

                startActivity(i);
            }
        });

        registerB = (Button)findViewById(R.id.RegisterButton);
        registerB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(NationalLibraryActivity.this, StartActivity.class);

                Context c = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(c, R.string.LibraryRegisterResult, duration);
                toast.show();

                startActivity(i);
            }
        });
    }
}
