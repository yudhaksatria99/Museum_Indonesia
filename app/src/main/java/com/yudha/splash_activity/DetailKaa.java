package com.yudha.splash_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetailKaa extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kaa);
        view=findViewById(R.id.view);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godashboard= new Intent(DetailKaa.this,Dashboard_Activity.class);
                startActivity(godashboard);
            }
        });
    }
}
