package com.adnedu.java3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebContentActivity extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_content);

        Intent newint = getIntent();
        String url = newint.getStringExtra("url");

        web = (WebView)findViewById(R.id.wvWeb);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(url);
        web.canGoBack();
        web.zoomIn();

    }
}
