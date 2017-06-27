package com.example.lucas.webview;

import android.Manifest;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
        }, 0);

        //url do servidor
        //String url = "http://177.105.60.185:7000/visual.html";
        String url = "http://uflamamute.000webhostapp.com";

        WebView webview = new WebView(this);
        webview.setWebViewClient(new WebViewClient());
        setContentView(webview);
        //webview.clearCache(true);
        //webview.clearHistory();
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);


        webview.loadUrl(url);
    }
}
