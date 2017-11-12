package com.madwak.kimondroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }


    public void funcQuiz(View view) {
        Intent quiz = new Intent(MainActivity.this,QuizActivity.class);
        startActivity(quiz);
        // finish();
    }

    public void funMateri(View view) {
        Intent materi = new Intent(MainActivity.this,MateriActivity.class);
        startActivity(materi);
        finish();
    }
}
