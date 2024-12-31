package com.example.projeoyun2;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Sayfa3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sayfa3);

        WebView webView = findViewById(R.id.webView);
        TextView txt_aciklama = findViewById(R.id.txt_acikalma);


        String video = getIntent().getStringExtra("youtubeUrl");
        String aciklama = getIntent().getStringExtra("aciklama");

        txt_aciklama.setText(aciklama);

        webView.loadData(video,"text/html","utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
    }
}