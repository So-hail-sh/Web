package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
     WebView web1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://www.google.com";
        web1 = findViewById(R.id.web11);

        web1.loadUrl(url);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.getSettings().setBuiltInZoomControls(true);
        web1.getSettings().setLoadsImagesAutomatically(true);
        web1.getSettings().setSupportMultipleWindows(true);

    }
    @Override
    public void onBackPressed() {
        if (web1.canGoBack()) {
            web1.canGoBack();
        }
        else{
            super.onBackPressed();
        }
    }
}