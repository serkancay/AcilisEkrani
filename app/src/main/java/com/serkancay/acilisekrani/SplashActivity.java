package com.serkancay.acilisekrani;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by serkan on 14.09.2016.
 */
public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_SURESI = 3000;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() { // SPLASH_SURESI bitince burası çalışacak.
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent); // MainActivity açılıyor.
                finish(); // Açılış ekranı bitirildi.
            }
        }, SPLASH_SURESI); // Bekleme süresi
    }
}
