package com.yudha.splash_activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView applogo,namalogo;
    Animation app_splash,nama_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        nama_logo = AnimationUtils.loadAnimation(this,R.anim.nama_logo);

        applogo=findViewById(R.id.applogo);
        namalogo=findViewById(R.id.namalogo);

        applogo.startAnimation(app_splash);
        namalogo.startAnimation(nama_logo);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent godashboard=new Intent(MainActivity.this,Dashboard_Activity.class);
                startActivity(godashboard);
                finish();
            }
        },3000);

    }
}
