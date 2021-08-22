package com.example.paathshala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class w3schools extends AppCompatActivity {
    ImageButton bs, php, css, py, dnet, java, cpp, js, jq, json, html, ajax, cg, sass, nd, sql, ml, dts, ajs, xml, xq, xp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w3schools);


        bs=(ImageButton) findViewById(R.id.bs);
        php=(ImageButton) findViewById(R.id.php);
        css=(ImageButton) findViewById(R.id.css);
        py=(ImageButton) findViewById(R.id.py);
        dnet=(ImageButton) findViewById(R.id.dnet);
        java=(ImageButton) findViewById(R.id.java);
        cpp=(ImageButton) findViewById(R.id.cpp);
        js=(ImageButton) findViewById(R.id.js);
        jq=(ImageButton) findViewById(R.id.jq);
        json=(ImageButton) findViewById(R.id.json);
        html=(ImageButton) findViewById(R.id.html);
        ajax=(ImageButton) findViewById(R.id.ajax);
        cg=(ImageButton) findViewById(R.id.cg);
        sass=(ImageButton) findViewById(R.id.sass);
        nd=(ImageButton) findViewById(R.id.nd);
        sql=(ImageButton) findViewById(R.id.sql);
        ml=(ImageButton) findViewById(R.id.ml);
        dts=(ImageButton) findViewById(R.id.dts);
        ajs=(ImageButton) findViewById(R.id.ajs);
        xml=(ImageButton) findViewById(R.id.xml);
        xq=(ImageButton) findViewById(R.id.xq);
        xp=(ImageButton) findViewById(R.id.xp);

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/bootstrap/bootstrap_ver.asp");
                startActivity(intent);

            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/php/default.asp");
                startActivity(intent);
            }
        });

        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", ("https://www.w3schools.com/css/default.asp"));
                startActivity(intent);
            }
        });

        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/python/default.asp");
                startActivity(intent);
            }
        });

        dnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/asp/default.ASP");
                startActivity(intent);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/java/default.asp");
                startActivity(intent);
            }
        });

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/cpp/default.asp");
                startActivity(intent);
            }
        });

        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/js/default.asp");
                startActivity(intent);
            }
        });

        jq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/jquery/default.asp");
                startActivity(intent);
            }
        });

        json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/js/js_json_intro.asp");
                startActivity(intent);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/html/default.asp");
                startActivity(intent);
            }
        });

        ajax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/js/js_ajax_intro.asp");
                startActivity(intent);
            }
        });

        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/graphics/default.asp");
                startActivity(intent);
            }
        });

        sass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/sass/default.php");
                startActivity(intent);
            }
        });

        nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/nodejs/default.asp");
                startActivity(intent);
            }
        });

        sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/sql/default.asp");
                startActivity(intent);
            }
        });

        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/python/python_ml_getting_started.asp");
                startActivity(intent);
            }
        });

        dts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/datascience/default.asp");
                startActivity(intent);
            }
        });

        ajs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/angular/default.asp");
                startActivity(intent);
            }
        });

        xml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/xml/default.asp");
                startActivity(intent);
            }
        });

        xq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/xml/xquery_intro.asp");
                startActivity(intent);
            }
        });

        xp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("url", "https://www.w3schools.com/xml/xpath_intro.asp");
                startActivity(intent);
            }
        });


    }


}
