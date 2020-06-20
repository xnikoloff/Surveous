package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Login extends AppCompatActivity {

    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        YoYo.with(Techniques.ZoomInLeft).repeat(0).duration(800).playOn(email);
        YoYo.with(Techniques.ZoomInLeft).repeat(0).duration(800).playOn(password);
    }
}
