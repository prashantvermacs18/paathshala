package com.example.paathshala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class geeksforgeeks extends AppCompatActivity {
    ImageButton dbms, ds, daa, os, cn, cd, coa, dm, eh, cg, se, html, cs, a, c, cpp, java, dnet, py, css, control_s, datamining;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geeksforgeeks);


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
        css=(ImageButton) findViewById(R.id.css);
        control_s=(ImageButton) findViewById(R.id.control_s);
        datamining=(ImageButton) findViewById(R.id.datamining);

        datamining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/data-mining/");
                startActivity(intent);
            }
        });

        control_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/version-control-systems/");
                startActivity(intent);
            }
        });

        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", ("https://www.geeksforgeeks.org/css-tutorials/"));
                startActivity(intent);
            }
        });

        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/python-programming-language/?ref=leftbar");
                startActivity(intent);
            }
        });

        dnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/introduction-to-net-framework/");
                startActivity(intent);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/java/?ref=leftbar");
                startActivity(intent);
            }
        });

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/c-plus-plus/?ref=leftbar");
                startActivity(intent);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/c/?ref=leftbar");
                startActivity(intent);
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/theory-of-computation-automata-tutorials/");
                startActivity(intent);
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/cyber-system-security/");
                startActivity(intent);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/html-tutorials/");
                startActivity(intent);
            }
        });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/software-engineering/");
                startActivity(intent);
            }
        });

        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/introduction-to-computer-graphics/");
                startActivity(intent);
            }
        });

        eh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/introduction-to-ethical-hacking/");
                startActivity(intent);
            }
        });

        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/engineering-mathematics-tutorials/");
                startActivity(intent);
            }
        });

        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/dbms/");
                startActivity(intent);
            }
        });

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/data-structures/");
                startActivity(intent);
            }
        });

        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/fundamentals-of-algorithms/");
                startActivity(intent);
            }
        });

        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/operating-systems/");
                startActivity(intent);
            }
        });

        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/computer-network-tutorials/");
                startActivity(intent);
            }
        });

        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/compiler-design-tutorials/");
                startActivity(intent);
            }
        });

        coa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.geeksforgeeks.org/computer-organization-and-architecture-tutorials/");
                startActivity(intent);
            }
        });


    }


}
