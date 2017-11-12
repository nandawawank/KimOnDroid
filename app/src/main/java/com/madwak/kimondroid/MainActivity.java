package com.madwak.kimondroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

    public void funcPetunjuk(View view) {
        Intent petunjuk = new Intent(MainActivity.this, PetunjukActivity.class);
        startActivity(petunjuk);
    }

    public void funcQuiz(View view) {
        Intent quiz = new Intent(MainActivity.this, QuizActivity.class);
        startActivity(quiz);
        // finish();
    }

    public void funMateri(View view) {
        Intent materi = new Intent(MainActivity.this, MateriActivity.class);
        startActivity(materi);
        // finish();
    }

    public void funcInfo(View view) {
        Intent info = new Intent(MainActivity.this, InfoActivity.class);
        startActivity(info);
    }

    public void funcMusic(View view) {

    }

    public void funcExit(View view) {
        AlertDialog.Builder dialogEnd = new  AlertDialog.Builder(this);
        dialogEnd.setTitle("Keluar");
        dialogEnd
                .setMessage("Apakah Kamu yakin ingin keluar?")
                //.setIcon(R.drawable.right)
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = dialogEnd.create();
        alertDialog.show();
    }
}
