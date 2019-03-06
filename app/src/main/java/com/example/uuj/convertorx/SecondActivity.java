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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    //Variables
    private Button ci;
    private Button cf;
    private Button sk;
    private Button ic;
    private Button fc;
    private Button ks;
    private Button changeWhite;
    private Button changeLightBlue;
    private Button changeBlue;
    private Button back;
    private EditText eText;
    private TextView result1;
    private TextView result2;
    private ConstraintLayout layoutsecond;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //Connecting variables to objects
        layoutsecond= findViewById(R.id.layoutsecond);

        ci = findViewById(R.id.btnCMIN);
        cf = findViewById(R.id.btnCF);
        sk = findViewById(R.id.btnSK);
        ic = findViewById(R.id.btnINCM);
        fc = findViewById(R.id.btnFC);
        ks = findViewById(R.id.btnKS);

        changeWhite = findViewById(R.id.btnCBWhite);
        changeLightBlue = findViewById(R.id.btnCBLBlue);
        changeBlue = findViewById(R.id.btnCBBlue);

        back = findViewById(R.id.btnBack);

        eText = findViewById(R.id.eText);

        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);


        //Event listeners
        ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eText.getText().toString().equals("")) {
                    result1.setText(R.string.error_name);
                    result1.setTextColor(Color.RED);
                   // result2.setTextColor(Color.BLACK);
                } else {
                    result1.setTextColor(Color.BLACK);
                    double iinc = 0.393701;
                    double fci = 0.0;
                    double total = Double.parseDouble(eText.getText().toString());
                    fci = total * iinc;
                    String text = eText.getText().toString();
                    result1.setText(text + " CM is: " + String.format("%.2f", fci) + " inches");
                }
            }
        });
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eText.getText().toString().equals("")) {
                    result1.setText(R.string.error_name);
                    result1.setTextColor(Color.RED);
                } else {
                    result1.setTextColor(Color.BLACK);
                    double finc = 33.8;
                    double rcf = 0.0;
                    double total = Double.parseDouble(eText.getText().toString())-1;
                    rcf = finc + (total*1.8);
                    String text = eText.getText().toString();
                    result1.setText(text + " C is: " + String.format("%.2f", rcf) + " F");
                }

            }
        });
        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eText.getText().toString().equals("")) {
                    result1.setText(R.string.error_name);
                    result1.setTextColor(Color.RED);

                } else {
                    result1.setTextColor(Color.BLACK);
                    double sink = 6.35029;
                    double rsk = 0.0;
                    double total = Double.parseDouble(eText.getText().toString());
                    rsk = total * sink;
                    String text = eText.getText().toString();
                    result1.setText(text + " ST is: " + String.format("%.2f", rsk) + " KG");
                }

            }
        });
        ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eText.getText().toString().equals("")) {
                    result1.setText(R.string.error_name);
                    result1.setTextColor(Color.RED);
                    result2.setText("");

                } else {

                    if (result1.getText().toString().equals("Please enter a valid number!")) {
                        result1.setText("");
                    }
                    result1.setTextColor(Color.BLACK);
                    double iinc = 2.54;
                    double ric = 0.0;
                    double total = Double.parseDouble(eText.getText().toString());
                    ric = total * iinc;
                    String text = eText.getText().toString();
                    result2.setText(text + " inches is: " + String.format("%.2f", ric) + " CM");
                }

            }
        });
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eText.getText().toString().equals("")) {
                    result1.setText(R.string.error_name);
                    result1.setTextColor(Color.RED);
                    result2.setText("");

                } else {

                    if (result1.getText().toString().equals("Please enter a valid number!")) {
                        result1.setText("");
                    }

                    result1.setTextColor(Color.BLACK);

                    if(eText.getText().toString().equals("32")){
                        result2.setText("32 F is: 0 C");

                    }else {

                    double cinf = -17.2222;
                    double rfc = 0.0;
                    double total = Double.parseDouble(eText.getText().toString())-1;
                    rfc = cinf + total*0.5555;
                    String text = eText.getText().toString();

                    if(result2.getText().toString().equals("32 F is: -0.00 C")){
                        result2.setText("0");
                    }
                    result2.setText(text + " F is: " + String.format("%.2f", rfc) + " C");}
                }

            }
        });
        ks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eText.getText().toString().equals("")) {
                    result1.setText(R.string.error_name);
                    result1.setTextColor(Color.RED);
                    result2.setText("");

                } else {

                    if (result1.getText().toString().equals("Please enter a valid number!")) {
                        result1.setText("");
                    }
                    result1.setTextColor(Color.BLACK);
                    double kins = 0.157473;
                    double rks = 0.0;
                    double total = Double.parseDouble(eText.getText().toString());
                    rks = total * kins;
                    String text = eText.getText().toString();
                    result2.setText(text + " KG is: " + String.format("%.2f", rks) + " ST");
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(inten);
                finish();

            }
        });

        changeWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondButtonsWhite();
                Toast.makeText(SecondActivity.this,"Successfully changed background to White", Toast.LENGTH_SHORT).show();


            }
        });

        changeLightBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondButtonsLightBlue();
                Toast.makeText(SecondActivity.this,"Successfully changed background to Light Blue", Toast.LENGTH_SHORT).show();


            }
        });

        changeBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondButtonsBlue();
                Toast.makeText(SecondActivity.this,"Successfully changed background to Blue", Toast.LENGTH_SHORT).show();


            }
        });

    }

    //Method that changes property color of objects when called.
    private void secondButtonsWhite(){
        layoutsecond.setBackgroundColor(getResources().getColor(R.color.white_background));
        ci.setBackgroundColor(getResources().getColor(R.color.button_white));
        cf.setBackgroundColor(getResources().getColor(R.color.button_white));
        sk.setBackgroundColor(getResources().getColor(R.color.button_white));
        ic.setBackgroundColor(getResources().getColor(R.color.button_white));
        fc.setBackgroundColor(getResources().getColor(R.color.button_white));
        ks.setBackgroundColor(getResources().getColor(R.color.button_white));
        back.setBackgroundColor(getResources().getColor(R.color.button_white));
        back.setTextColor(getResources().getColor(R.color.button_black));
    }

    //Method that changes property color of objects when called.
    private void secondButtonsLightBlue(){
        layoutsecond.setBackgroundColor(getResources().getColor(R.color.lightb_background));
        ci.setBackgroundColor(getResources().getColor(R.color.button_green));
        cf.setBackgroundColor(getResources().getColor(R.color.button_green));
        sk.setBackgroundColor(getResources().getColor(R.color.button_green));
        ic.setBackgroundColor(getResources().getColor(R.color.button_green));
        fc.setBackgroundColor(getResources().getColor(R.color.button_green));
        ks.setBackgroundColor(getResources().getColor(R.color.button_green));
        back.setBackgroundColor(getResources().getColor(R.color.button_black));
        back.setTextColor(getResources().getColor(R.color.button_white));
    }

    //Method that changes property color of objects when called.
    private void secondButtonsBlue(){
        layoutsecond.setBackgroundColor(getResources().getColor(R.color.blue_background));
        ci.setBackgroundColor(getResources().getColor(R.color.button_green));
        cf.setBackgroundColor(getResources().getColor(R.color.button_green));
        sk.setBackgroundColor(getResources().getColor(R.color.button_green));
        ic.setBackgroundColor(getResources().getColor(R.color.button_green));
        fc.setBackgroundColor(getResources().getColor(R.color.button_green));
        ks.setBackgroundColor(getResources().getColor(R.color.button_green));
        back.setBackgroundColor(getResources().getColor(R.color.button_black));
        back.setTextColor(getResources().getColor(R.color.button_white));
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("TAG","This is on PostResume called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","This is on Start called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","This is on Stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","This is on Destroy called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","This is on Pause called");
    }

}
