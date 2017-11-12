package com.madwak.kimondroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class QuizActivity extends AppCompatActivity {

    String[] pertanyaan = { "Campuran yang ukuran partikel terdispersinya berada di antara larutan dan suspensi adalah…",
            "Sistem koloid dari pertikel padat atau cair yang terdispersi dalam gas adalah…",
            "Sistem koloid dari gas yang terdispersi dalam zat cair adalah...",
            "Peristiwa penyerapan muatan oleh permukaan-permukaan partikel koloid adalah...",
            "Proses penggumpalan partikel-partikel koloid dalam suatu sistem koloid adalah...",
            "Cara pembuatan sistem koloid dengan mengubah partikel-partikel larutan sejati menjadi pertikel koloid adalah...",
            "Sebutkan beberapa cara pembuatan sistem koloid...",
            "Koagulasi koloid dapat terjadi dengan dua cara...",
            "Peristiwa penghamburan partikel koloid oleh cahaya adalah...",
            "Contoh sistem koloid dari fase terdispersi padat dalam pendispersi cair adalah..."};
    String[] jawaban = { "Koloid", "Aerosol", "Buih", "Adsorbsi", "Koagulasi", "Cara Kondensasi", "Kondensasi dan Dispersi", "Mekanik dan Kimia", "Efek Tyndall", "Tinta" };

    List history = new ArrayList();
    TextView tvQuestion;
    Button myAnswer;

    int myScore = 0;
    int indexQuest = 0;
    int totalQuest = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        tvQuestion = (TextView) findViewById(R.id.tvQuestion);

        setQuest();
    }

    void setQuest() {
        if (totalQuest < 10) {
            // mengambil indeks untuk pertanyaan secara acak dari 0 - 9
            indexQuest = (int) (Math.random() * pertanyaan.length);

            // mengecek apakah indeks yang didapat sudah pernah didapat sebelumnya
            for (int n = 0; n < history.size(); n++) {
                if ((int) history.get(n) == indexQuest) {
                    out.println("Jejak ?= Indeks : " + (int) history.get(n) + " ?= " + indexQuest);

                    indexQuest = (int) (Math.random() * pertanyaan.length);
                    n = 0;
                }
            }
            totalQuest++;
            history.add(indexQuest);
            out.println(pertanyaan[indexQuest].toString() + "? " + jawaban[indexQuest].toString());

            tvQuestion.setText(totalQuest + ". " + pertanyaan[indexQuest].toString());
        }
        else {
            // jika permainan selesai maka akan ditampilkan dialog quiz selesai dan menampilkan nilai yang diperoleh
            AlertDialog.Builder dialogEnd = new  AlertDialog.Builder(this);
            dialogEnd.setTitle("Quiz berakhir!");
            dialogEnd
                    .setMessage("Selamat! Kamu berhasil menjawab " + myScore / 10 + " pertanyaan \nNilai Kamu: " + myScore)
                    //.setIcon(R.drawable.right)
                    .setCancelable(false)
                    .setPositiveButton("Beranda", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    })
                    .setNegativeButton("Ulang Kuis", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            totalQuest = 0;
                            history.clear();
                            setQuest();
                            dialog.cancel();
                        }
                    });
            AlertDialog alertDialog = dialogEnd.create();
            alertDialog.show();
        }
    }

    public void myAnswer(View view) {
        myAnswer = (Button) view;

        // jika jawaban yang dipilih sama dengan jawaban yang memiliki indeks sama dengan indeks pertanyaan
        if (myAnswer.getText().toString().toLowerCase().equals(jawaban[indexQuest].toLowerCase())) {
            myScore =+ 10;
            // displayToast((String) myAnswer.getText() + " jawaban yang benar!");
        }
        else{
            // displayToast((String) myAnswer.getText() + " jawaban yang salah!");
        }
        setQuest();
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
