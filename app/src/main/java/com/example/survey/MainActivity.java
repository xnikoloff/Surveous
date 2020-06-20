package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    Button profileBtn, musicBtn;
    TextView surveyTexTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileBtn = findViewById(R.id.profileBtn);
        musicBtn = findViewById(R.id.music_btn);
        surveyTexTv = findViewById(R.id.survey_textv);

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });

        musicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Bounce).repeat(2).duration(200).playOn(musicBtn);

                Intent intent = new Intent(MainActivity.this, ActiveTopics.class);
                startActivity(intent);

            }
        });

        YoYo.with(Techniques.ZoomInLeft).repeat(0).duration(800).playOn(surveyTexTv);

    }
}
