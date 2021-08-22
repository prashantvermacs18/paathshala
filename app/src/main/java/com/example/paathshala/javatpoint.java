package com.example.paathshala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class javatpoint extends AppCompatActivity {
    ImageButton dbms, ds, daa, os, cn, cd, coa, dm, eh, cg, se, html, cs, a, c, cpp, java, dnet, py, programs, control_s, datamining;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javatpoint);


        dbms=(ImageButton) findViewById(R.id.dbms);
        ds=(ImageButton) findViewById(R.id.ds);
        daa=(ImageButton) findViewById(R.id.daa);
        os=(ImageButton) findViewById(R.id.os);
        cn=(ImageButton) findViewById(R.id.cn);
        cd=(ImageButton) findViewById(R.id.cd);
        coa=(ImageButton) findViewById(R.id.coa);
        dm=(ImageButton) findViewById(R.id.dm);
        eh=(ImageButton) findViewById(R.id.eh);
        cg=(ImageButton) findViewById(R.id.cg);
        se=(ImageButton) findViewById(R.id.se);
        html=(ImageButton) findViewById(R.id.html);
        cs=(ImageButton) findViewById(R.id.cs);
        a=(ImageButton) findViewById(R.id.a);
        c=(ImageButton) findViewById(R.id.c);
        cpp=(ImageButton) findViewById(R.id.cpp);
        java=(ImageButton) findViewById(R.id.java);
        dnet=(ImageButton) findViewById(R.id.dnet);
        py=(ImageButton) findViewById(R.id.py);
        programs=(ImageButton) findViewById(R.id.programs);
        control_s=(ImageButton) findViewById(R.id.control_s);
        datamining=(ImageButton) findViewById(R.id.datamining);

        datamining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/data-mining");
                startActivity(intent);

            }
        });

        control_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/control-system-tutorial");
                startActivity(intent);
            }
        });

        programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", ("https://www.javatpoint.com/programs-list"));
                startActivity(intent);
            }
        });

        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/python-tutorial");
                startActivity(intent);
            }
        });

        dnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/net-framework");
                startActivity(intent);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/java-tutorial");
                startActivity(intent);
            }
        });

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/cpp-tutorial");
                startActivity(intent);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/c-programming-language-tutorial");
                startActivity(intent);
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/automata-tutorial");
                startActivity(intent);
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/cyber-security-tutorial");
                startActivity(intent);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/html-tutorial");
                startActivity(intent);
            }
        });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/software-engineering-tutorial");
                startActivity(intent);
            }
        });

        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/computer-graphics-tutorial");
                startActivity(intent);
            }
        });

        eh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/ethical-hacking-tutorial");
                startActivity(intent);
            }
        });

        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/discrete-mathematics-tutorial");
                startActivity(intent);
            }
        });

        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/dbms-tutorial");
                startActivity(intent);
            }
        });

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/data-structure-tutorial");
                startActivity(intent);
            }
        });

        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/daa-tutorial");
                startActivity(intent);
            }
        });

        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/os-tutorial");
                startActivity(intent);
            }
        });

        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/computer-network-tutorial");
                startActivity(intent);
            }
        });

        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/compiler-tutorial");
                startActivity(intent);
            }
        });

        coa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.javatpoint.com/computer-organization-and-architecture-tutorial");
                startActivity(intent);
            }
        });


    }


}