package com.example.sfkcorp;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class about extends AppCompatActivity {
    WebView webView;
    public String fileName = "about.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        webView = (WebView) findViewById(R.id.about);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/"+fileName);

    }
}