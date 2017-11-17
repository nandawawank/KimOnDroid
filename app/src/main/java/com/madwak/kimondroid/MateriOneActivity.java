package com.madwak.kimondroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MateriOneActivity extends AppCompatActivity {
    ListView lv;
    Context context;

    ArrayList prgmName;
    public static Integer[] image_one = {
            R.drawable.imgsubone,
            R.drawable.imgsubonetwo,
            R.drawable.imgsubonethre,
            R.drawable.imgsubonefour,
            R.drawable.imgsubonefive,
            R.drawable.imgsubonesix,
            R.drawable.imgsuboneseven,
            R.drawable.imgsuboneeight,
            R.drawable.imgsubonenine
    };

    public static String[] materi_one = {
            "Dalam kehidupan sehari-hari kita sering menemukan zat yang memiliki sifat berbentuk campuran homogen namun tidak bening, " +
            "atau keruh, seperti berbagai jenis minuman, susu atau pylox. Berdasarkan jenis fasa pendispersi, yaitu zat yang memiliki " +
            "jumlah lebih banyak dan fasa zat yang terdispersi koloid terbagi menjadi delapan macam.\n\n" +
            "1. Fenomena Kabut\n" +
            "Fase terdispersinya air+medium pendipersinya gas > Aerosol/kabut.",
            "2. Fenomena Asap\n" +
            "Fase terdispersinya debu (padat) + medium pendispersinya udara (gas) > Asap.",
            "3. Buih Cair\n" +
            "Fase terdispersinya udara (gas) + medium pendispersinya putih telur (cair) > Buih Krim.",
            "4. Emulsi\n" +
            "Fase terdispersinya partikel lemak susu (cair) + medium pendispersinya air (cair) > Air susu.",
            "5. Sol Cair\n" +
            "Fase terdispersinya resin/latex (padat) + medium pendispersinya solvent hidrokarbon (cair) > Cat.",
            "6. Buih Padat\n" +
            "Fase terdispersinya udara (gas) + medium pendispersinya gelatin (padat) > Marshmallow.",
            "7. Emulsi Padat\n" +
            "Fase terdispersinya susu (cair) + medium pendispersinya lemak hewan padat > Mentega.",
            "8. Sol Padat\n" +
            "Fase terdispersinya pasir kuarsa (padat) + CaCO3 (padat) > Kaca.",
            "Kesimpulan\n" +
            "Berdasarkan fenomena di atas, dapat disimpulkan bahwa:"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_materi_one);

        context = this;

        lv = (ListView) findViewById(R.id.materi_one);
        lv.setAdapter(new CustomAdapterOne(this, materi_one, image_one));

//        String[] materi_one= getResources().getStringArray(R.array.materi_satu);

//        ListView listview =(ListView) findViewById(R.id.materi_one);
//        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, materi_one);
//        listview.setAdapter(adapter);

    }

    public void funcBack(View view) {
        finish();
    }
}
