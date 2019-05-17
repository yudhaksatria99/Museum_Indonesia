package com.yudha.splash_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dashboard_Activity extends AppCompatActivity {

    LinearLayout Mnasional,Mangkut,Mbatik,Mgeologi,Mkaa,Mkesenian,Msampoerna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_);
        Mnasional=findViewById(R.id.Mnasional);
        Mangkut=findViewById(R.id.Mangkut);
        Mbatik=findViewById(R.id.Mbatik);
        Mgeologi=findViewById(R.id.Mgeologi);
        Mkaa=findViewById(R.id.Mkaa);
        Mkesenian=findViewById(R.id.Mkesenian);
        Msampoerna=findViewById(R.id.Msampoerna);



        Mnasional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godetail=new Intent(Dashboard_Activity.this,DetailNasional.class);
                startActivity(godetail);
            }
        });
        Mangkut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godetail=new Intent(Dashboard_Activity.this,DetailAngkut.class);
                startActivity(godetail);
            }
        });
        Mbatik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godetail=new Intent(Dashboard_Activity.this,DetailBatik.class);
                startActivity(godetail);
            }
        });
        Mgeologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godetail=new Intent(Dashboard_Activity.this,DetailGeologi.class);
                startActivity(godetail);
            }
        });
        Mkaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godetail=new Intent(Dashboard_Activity.this,DetailKaa.class);
                startActivity(godetail);
            }
        });
        Mkesenian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godetail=new Intent(Dashboard_Activity.this,DetailKesenian.class);
                startActivity(godetail);
            }
        });
        Msampoerna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godetail=new Intent(Dashboard_Activity.this,DetailSampoerna.class);
                startActivity(godetail);
            }
        });
    }
}
