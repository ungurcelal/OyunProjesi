package com.example.projeoyun2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Animasyon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animasyon);

        ImageView img1 = findViewById(R.id.img1);
        Button btn1 = findViewById(R.id.btn);
        Animation animation =
                AnimationUtils.loadAnimation(Animasyon.this, R.anim.anim1);
        img1.startAnimation(animation);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent git = new Intent(Animasyon.this, MainActivity.class);
                startActivity(git);
            }
        });
    }
}