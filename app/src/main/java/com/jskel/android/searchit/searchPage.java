package com.jskel.android.searchit;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class searchPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

    }


    public final void displayResults(View view){
        EditText editText = (EditText) findViewById(R.id.searchField);
        String searchParams = editText.toString();
        Intent intent = new Intent(this, displaySearch.class);
        startActivity(intent);
    }


//    class myWebClient extends WebViewClient {
//
//        @Override
//        public void onPageStarted(WebView view, String url, Bitmap favicon) {
//            favicon = BitmapFactory.decodeResource(getResources(), android.R.mipmap.sym_def_app_icon);
//            super.onPageStarted(view, url, favicon);
//
//        }


        /**
         * @param webView view to be passed to
         * @param url string containing the url
         */
        /*public void launchPage(WebView webView, String url){

            webView.loadUrl(url);
        }*/


    }


