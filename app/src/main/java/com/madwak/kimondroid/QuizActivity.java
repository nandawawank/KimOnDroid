package com.madwak.kimondroid;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class QuizActivity extends AppCompatActivity {

    String[] pertanyaan = {
            "Campuran yang ukuran partikel terdispersinya berada di antara larutan dan suspensi adalah…",
            "Sistem koloid dari pertikel padat atau cair yang terdispersi dalam gas adalah…",
            "Sistem koloid dari gas yang terdispersi dalam zat cair adalah...",
            "Peristiwa penyerapan muatan oleh permukaan-permukaan partikel koloid adalah...",
            "Proses penggumpalan partikel-partikel koloid dalam suatu sistem koloid adalah...",
            "Cara pembuatan sistem koloid dengan mengubah partikel-partikel larutan sejati menjadi pertikel koloid adalah...",
            "Sebutkan beberapa cara pembuatan sistem koloid...",
            "Koagulasi koloid dapat terjadi dengan dua cara...",
            "Peristiwa penghamburan partikel koloid oleh cahaya adalah...",
            "Contoh sistem koloid dari fase terdispersi padat dalam pendispersi cair adalah...",
            "Jelaskan apa yang dimaksud dengan istilah dispersi koloid...",
            "Partikel koloid bermuatan positif akan bergerak menuju kutub negatif (katode) partikel koloid yang bermuatan\n"+
            "negatif akan bergerak ke arah kutub positif (anode). Fenomena koloid apa yang dimaksud?",
            "Partikel-partikel koloid bersifat stabil dengan adanya muatan listrik. Jika muatannya hilang, maka partikel-partikel\n" +
            "koloid dapat saling bergabung membentuk gumpalan karena gravitasi, maka gumpalan itu akan mengendap. contoh sifat koloid apa yang dimaksud ...",
            "Perbedaan koloid liofil dan liofob...",
            "Jelaskan mengapa dispersi koloid stabil atau tidak mudah terkoagulasi..."
    };
    String[] jawaban = {
            "Koloid", "Aerosol", "Buih", "Adsorbsi", "Koagulasi",
            "Cara Kondensasi", "Kondensasi dan Dispersi", "Mekanik dan Kimia", "Efek Tyndall", "Tinta",
            "Pemecahan Partikel Kasar Menjadi Partikel Koloid", "Elektroforesis", "Adsorpsi","Koloid liofil kurang stabil dari koloid liofob",
            "Adanya gerak brown berukuran partikel koloid yang membuat gaya gravitasi tidak berpengaruh"
    };
    String[] tanyajawab = new String[15];

    List history = new ArrayList();
    ArrayAdapter<String> listPembahasan;
    ListView pembahasan;
    Button exit;

    TextView tvQuestion;
    Button myAnswer;

    int myScore = 0;
    int indexQuest = 0;
    int totalQuest = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quiz);

        exit = (Button) findViewById(R.id.buttonBack);
        pembahasan = (ListView) findViewById(R.id.pembahasan);
        tvQuestion = (TextView) findViewById(R.id.tvQuestion);
        setQuest();

        for (int i=0; i<pertanyaan.length; i++) {
            tanyajawab[i] = pertanyaan[i] + " " + jawaban[i];
        }
        listPembahasan = new ArrayAdapter<String>(this, R.layout.activity_pembahasan, tanyajawab);
    }

    void setQuest() {
        if (totalQuest < 15) {
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
            if (myScore >= 70) {
                dialogEnd
                        .setMessage("Selamat! Kamu berhasil menjawab " + myScore / 10 + " pertanyaan \nNilai Kamu: " + myScore)
                        .setIcon(R.drawable.ic_stars)
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
                        })
                        .setNeutralButton("Pembahasan", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                exit.setVisibility(View.VISIBLE);
                                pembahasan.setVisibility(View.VISIBLE);
                                pembahasan.setAdapter(listPembahasan);
                            }
                        });
            }
            else {
                dialogEnd
                        .setMessage("Selamat! Kamu berhasil menjawab " + myScore / 10 + " pertanyaan \nNilai Kamu: " + myScore)
                        .setIcon(R.drawable.ic_stars)
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
            }
            AlertDialog alertDialog = dialogEnd.create();
            alertDialog.show();
        }
    }

    public void myAnswer(View view) {
        myAnswer = (Button) view;

        // jika jawaban yang dipilih sama dengan jawaban yang memiliki indeks sama dengan indeks pertanyaan
        if (myAnswer.getText().toString().toLowerCase().equals(jawaban[indexQuest].toLowerCase())) {
            myScore += 10;
//             displayToast((String) myAnswer.getText() + " jawaban yang benar! Skor: " + myScore);
        }
        else{
//             displayToast((String) myAnswer.getText() + " jawaban yang salah!");
        }
        setQuest();
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void funcBack(View view) {
        finish();
    }
}
