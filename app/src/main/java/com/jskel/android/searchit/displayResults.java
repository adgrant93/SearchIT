package com.jskel.android.searchit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class displayResults extends AppCompatActivity {
    WebView google;


    /*
    * The sole purpose of this activity is simply to display the results requested.
    * Currently, this displays the search results page on google sites.
    * This will remain until the passing of parameters is complete.
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_results);
        String testParam = "ITC";
        this.google = findViewById(R.id.google_com);
        this.google.setWebViewClient(new WebViewClient()); //creates instance of a webview
        this.google.setWebChromeClient(new WebChromeClient()); //May need to be removed
        this.google.getSettings().setJavaScriptEnabled(true); //May be security concern. More research required
        this.google.loadUrl("https://sites.google.com/a/alignedtechnologysolutions.com/ats-wiki/system/app/pages/search?scope=search-site&q="+testParam);
    }
}
