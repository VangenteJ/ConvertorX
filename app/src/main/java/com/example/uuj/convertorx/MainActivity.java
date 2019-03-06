package com.example.uuj.convertorx;

import android.content.Intent;
import android.graphics.Color;
import android.nfc.Tag;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Here are all variables used for tis class
    private Button getStarted;
    private Button setWhite;
    private Button setLightBlue;
    private Button setBlue;
    private ConstraintLayout layoutfirst;

    //first
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //All variables are being connected to its respective objects
        layoutfirst= findViewById(R.id.layoutfirst);

        setWhite = findViewById(R.id.btnWhite);
        setLightBlue = findViewById(R.id.btnLightBlue);
        setBlue = findViewById(R.id.btnBlue);

        getStarted= findViewById(R.id.btnStart);



        //Event listeners for all of my buttons
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten= new Intent(MainActivity.this, SecondActivity.class);
                startActivity(inten);

            }
        });

        setWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstButtonWhite();
                Toast.makeText(MainActivity.this,"Successfully changed background to White", Toast.LENGTH_SHORT).show();


            }
        });

        setLightBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstButtonLightBlue();
                Toast.makeText(MainActivity.this,"Successfully changed background to Light Blue", Toast.LENGTH_SHORT).show();
            }
        });

        setBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstButtonBlue();
                Toast.makeText(MainActivity.this,"Successfully changed background to Blue", Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Method that changes property color of objects when called.
    private void firstButtonWhite(){
        layoutfirst.setBackgroundColor(getResources().getColor(R.color.white_background));
        getStarted.setBackgroundColor(getResources().getColor(R.color.button_white));
        setWhite.setBackgroundColor(getResources().getColor(R.color.button_white));
        setLightBlue.setBackgroundColor(getResources().getColor(R.color.lightb_background));
        setBlue.setBackgroundColor(getResources().getColor(R.color.blue_background));

    }

    //Method that changes property color of objects when called.
    private void firstButtonLightBlue(){
        layoutfirst.setBackgroundColor(getResources().getColor(R.color.lightb_background));
        getStarted.setBackgroundColor(getResources().getColor(R.color.button_green));
        setWhite.setBackgroundColor(getResources().getColor(R.color.white_background));
        setLightBlue.setBackgroundColor(getResources().getColor(R.color.lightb_background));
        setBlue.setBackgroundColor(getResources().getColor(R.color.blue_background));

    }

    //Method that changes property color of objects when called.
    private void firstButtonBlue(){
        layoutfirst.setBackgroundColor(getResources().getColor(R.color.blue_background));
        getStarted.setBackgroundColor(getResources().getColor(R.color.button_green));
        setWhite.setBackgroundColor(getResources().getColor(R.color.white_background));
        setLightBlue.setBackgroundColor(getResources().getColor(R.color.lightb_background));
        setBlue.setBackgroundColor(getResources().getColor(R.color.blue_background));
    }

    //third
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("TAG","This is on PostResume called");
    }

    //second
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","This is on Start called");
    }

    //fifth
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","This is on Stop called");
    }

    //sixth
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","This is on Destroy called");
    }

    //fourth
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","This is on Pause called");
    }

}
