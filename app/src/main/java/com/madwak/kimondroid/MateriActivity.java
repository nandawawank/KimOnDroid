package com.madwak.kimondroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MateriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_materi);
    }

    public void funcMateriOne(View view) {
        Intent materiOne = new Intent(MateriActivity.this, MateriOneActivity.class);
        startActivity(materiOne);
        //finish();
    }


    public void funcMateriTwo(View view) {
        Intent materiTwo = new Intent(MateriActivity.this, MateriTwoActivity.class);
        startActivity(materiTwo);
        //finish();
    }


    public void funcMateriThre(View view) {
        Intent materiThre = new Intent(MateriActivity.this, MateriThreActivity.class);
        startActivity(materiThre);
        //finish();
    }

    public void funcMateriFour(View view) {
        Intent materiFour = new Intent(MateriActivity.this, MateriFourActivity.class);
        startActivity(materiFour);
        //finish();
    }

    public void funcBack(View view) {
//        Intent back = new Intent(MateriActivity.this, MainActivity.class);
//        startActivity(back);
        finish();
    }
}
