package com.example.paathshala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class website extends AppCompatActivity{

        ImageButton jtlogo, gfglogo, w3logo;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_website);
            jtlogo=(ImageButton) findViewById(R.id.jtlogo);
            gfglogo=(ImageButton) findViewById(R.id.gfglogo);
            w3logo=(ImageButton) findViewById(R.id.w3logo);


            jtlogo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), javatpoint.class));
                }
            });

            gfglogo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(website.this, geeksforgeeks.class);
                    startActivity(intent);
                }
            });

            w3logo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(website.this, w3schools.class);
                    startActivity(intent);
                }
            });


        }
}

