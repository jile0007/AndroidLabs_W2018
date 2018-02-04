package com.example.emma_jil.androidlabs_w2018;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {

    protected static final String ACTIVITY_NAME = "StartActivity";
    Button startGoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(ACTIVITY_NAME, "In onStart");
        setContentView(R.layout.activity_start);

        startGoButton = (Button)findViewById(R.id.startGo);
        startGoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(StartActivity.this, NationalLibraryActivity.class);
                startActivity(i);
            }
        });
    }
}
