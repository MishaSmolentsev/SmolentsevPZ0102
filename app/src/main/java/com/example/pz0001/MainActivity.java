package com.example.pz0001;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn, btn4, btn_alert, btn1, btn2;
private RatingBar rating;
private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton (){
        pass = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        btn4 = (Button)findViewById(R.id.button4);
        btn2 = (Button)findViewById(R.id.button2);
        btn1 = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void onClick(View v) {
                        btn.setText("Done");
                        btn.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        Toast.makeText(
                                MainActivity.this, pass.getText(),
                                Toast.LENGTH_SHORT

                        ).show();
                    }
                }
        );
                        btn4.setOnClickListener(
                                new View.OnClickListener() {
                                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                                    @Override
                                    public void onClick(View v) {
                                        btn.setText("Ne Done");
                                        btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                                        Toast.makeText(
                                                MainActivity.this, pass.getText(),
                                                Toast.LENGTH_SHORT
                                        ).show();
                                    }
                                }
                        );
                        btn2.setOnClickListener(
                                new View.OnClickListener() {
                                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(".MainActivity2");
                                        startActivity(intent);
                                    }
                                }
                        );
                                        btn1.setOnClickListener(
                                                new View.OnClickListener(){
                                                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                                                    @Override
                                                    public void onClick (View v) {
                                                        Intent intent = new Intent(".MainActivity3");
                                                        startActivity(intent);

                    }
                }
        );
    }
}