package com.adnedu.java3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebContentActivity extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_content);

        web = (WebView)findViewById(R.id.wvWeb);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://www.prothomalo.com/");
        web.canGoBack();
        web.zoomIn();

    }
}
