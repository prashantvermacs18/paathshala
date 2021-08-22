package com.example.paathshala;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {
    String website;
    WebView webview;

    @Override
    public void onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack();
        }
        else{
        super.onBackPressed();}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webview=findViewById(R.id.webview);

        website=getIntent().getStringExtra("url");

        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(website);

        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);




    }
}