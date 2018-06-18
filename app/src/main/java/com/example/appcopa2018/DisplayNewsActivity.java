package com.example.appcopa2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DisplayNewsActivity extends AppCompatActivity {

    private WebView browser;
//    private WebView browser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_news);

        openURL();
    }

    public void openURL() {
        String url = "https://esporte.uol.com.br/futebol/copa-do-mundo/2018/noticias/2018/06/16/brasil-estreia-na-copa-como-favorito-mas-nao-consegue-se-livrar-do-7-a-1.htm";
        browser = (WebView) findViewById(R.id.web_view);
        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl(url);

//        String url2 = "https://globoesporte.globo.com/futebol/selecao-brasileira/";
//        browser2 = (WebView) findViewById(R.id.web_view_2);
//        browser2.getSettings().setLoadsImagesAutomatically(true);
//        browser2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//        browser2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//        browser2.setWebViewClient(new WebViewClient());
//        browser2.loadUrl(url2);
    }
}
