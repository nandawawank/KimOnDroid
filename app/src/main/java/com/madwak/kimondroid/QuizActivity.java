package com.madwak.kimondroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    String[] Pertanyaan = { "Campuran yang ukuran partikel terdispersinya berada di antara larutan dan suspensi adalah…",
            "Sistem koloid dari pertikel padat atau cair yang terdispersi dalam gas adalah…",
            "Sistem koloid dari gas yang terdispersi dalam zat cair adalah...",
            "Peristiwa penyerapan muatan oleh permukaan-permukaan partikel koloid adalah...",
            "Proses penggumpalan partikel-partikel koloid dalam suatu sistem koloid adalah...",
            "Cara pembuatan sistem koloid dengan mengubah partikel-partikel larutan sejati menjadi pertikel koloid adalah...",
            "Sebutkan beberapa cara pembuatan sistem koloid...",
            "Koagulasi koloid dapat terjadi dengan dua cara...",
            "Peristiwa penghamburan partikel koloid oleh cahaya adalah...",
            "Contoh sistem koloid dari fase terdispersi padat dalam pendispersi cair adalah..."};

    TextView tvQuestion = (TextView) findViewById(R.id.tvQuestion);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
}
