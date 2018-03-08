package com.madwak.kimondroid;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
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
            "... +medium pendipersinya gas > Aerosol/kabut.",
            "Berdasarkan fenomena di atas senyawa apa yang menjadi fase terdisfersinya?\n" +
            "Contoh fenomena kabut dapat dilihat dilink ini :\n" +
            "http://youtu.be/Hc4NOOnqoeI"
            + "\n2. Fenomena Asap\n" +
            "Fase terdispersinya debu (padat) + ... > Asap.",
            "Berdasarkan fenomena di atas senyawa apa yang bertindak sebagai medium pendisfersi?\n" +
            "Contoh fenomena asap dapat dilihat dilink ini :\n" +
            "http://youtu.be/TaeiiUGKhNA"
            + "\n3. Buih Cair\n" +
            "Fase terdispersinya udara (gas) + medium pendispersinya putih telur (cair) > Buih Krim.",
            "Selain buih krim sebutkan contoh buih cari berdasarkan fase terdisfersi dan medium pendisfersi?\n" +
            "Contoh fenomena buih cari dapat dilihat dilink ini :\n" +
            "http://youtu.be/qdDqfHQuNqA"
            + "\n4. Emulsi\n" +
            "Fase terdispersinya partikel lemak susu (cair) + ... > Air susu.",
            "Berdasarkan media di atas apa yang menjadi medium pendisfersi susu?\n" +
            "Contoh fenomena emulsi dapat dilihat dilink ini :\n" +
            "http://youtu.be/u5o-3AkCBpk"
            + "\n5. Sol Cair\n" +
            "Fase terdispersinya resin/latex (padat) + medium pendispersinya solvent hidrokarbon (cair) > Cat.",
            "\nContoh fenomena sol cair dapat dilihat dilink ini :\n" +
            "http://youtu.be/BS72x0d9E44" +
            "\nKenapa latek(padat) bisa dijadikan bahan pembuat cat air?\n"
            + "\n6. Buih Padat\n" +
            "Fase terdispersinya udara (gas) + medium pendispersinya gelatin (padat) > Marshmallow.",
            "\nContoh fenomena buih padat dapat dilihat dilink ini :\n" +
            "http://youtu.be/x2rntzs8lso" +
            "\nSelain marshmellow apa saja dalam kehidupan sehari-hari yang termasuk contoh buih padat?\n"
            + "\n7. Emulsi Padat\n" +
            "... + medium pendispersinya lemak hewan padat > Mentega.",
            "\nContoh fenomena emulsi pada dapat dilihat dilink ini :\n" +
            "http://youtu.be/RqWi0NLlnec" +
            "\nBerdasarkan fenomena di atas senyawa apa yang bertindak sebagai fase terdisfersi?\n"
            + "\n8. Sol Padat\n" +
            "Fase terdispersinya padat + padat ...",
            "Berikan contoh fenomena yang berhubungan dengan sol padat dalam kehidupan sehari-hari?\n"
            + "\nKesimpulan\n" +
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
