package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Register extends AppCompatActivity {
    EditText email, password, username, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        username = findViewById(R.id.username);
        age = findViewById(R.id.age);

        YoYo.with(Techniques.ZoomInLeft).repeat(0).duration(800).playOn(email);
        YoYo.with(Techniques.ZoomInLeft).repeat(0).duration(800).playOn(password);
        YoYo.with(Techniques.ZoomInLeft).repeat(0).duration(800).playOn(username);
        YoYo.with(Techniques.ZoomInLeft).repeat(0).duration(800).playOn(age);
    }
}
