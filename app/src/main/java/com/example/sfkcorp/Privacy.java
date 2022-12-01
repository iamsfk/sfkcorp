package com.example.sfkcorp;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Privacy extends AppCompatActivity {
WebView webView;
public String fileName = "privacy.html";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        webView = (WebView) findViewById(R.id.privacy);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/"+fileName);
    }
}