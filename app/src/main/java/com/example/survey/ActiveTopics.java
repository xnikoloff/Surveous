package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ActiveTopics extends AppCompatActivity {

    Button favAristsGenreBtn;
    TextView topicsTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_topics);

        favAristsGenreBtn = findViewById(R.id.favAristsGenreBtn);
        topicsTv = findViewById(R.id.topics_textv);

        favAristsGenreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActiveTopics.this, Survey.class);
                startActivity(intent);
            }
        });

        YoYo.with(Techniques.ZoomInLeft).repeat(0).duration(800).playOn(topicsTv);
    }
}
