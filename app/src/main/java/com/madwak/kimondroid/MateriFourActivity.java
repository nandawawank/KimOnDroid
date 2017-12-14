package com.madwak.kimondroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MateriFourActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static Integer[] image_four={
            R.drawable.imgmaterisatu,
            R.drawable.imgmateridua,
            R.drawable.imgmateritiga,
            R.drawable.imgmateriempat
    };
    public static String[] materi_four={
            "Dalam kehidupan sehari-hari banyak kegunaan koloid baik langsung maupun tidak langsung. Beberapa kegunaan koloid " +
            "adalah sebagai berikut:\n\n" +
            "1. Industri kosmetika\n" +
            "Bahan kosmetika seperti foundation, finishing cream, dan deodorant berbentuk koloid dan umumnya sebagai emulsi.",
            "Klasifikasikan produk kosmetik apa saja yang termasuk ke dalam peranan koloid dalam kehidupan sehari-hari\n" +
            "Jelaskan termasuk ke dalam jenis koloid apa produk kosmetik tersebut!\n"
            + "\n2. Industri tekstil\n" +
            "Pada proses pencelupan bahan (untuk pewarnaan) yang kurang baik daya serapnya terhadap zat warna dapat menggunakan " +
            "zat warna koloid karena memiliki daya serap yang tinggi sehingga dapat melekat pada tekstil.",
            "Industri tekstil apa saja yang menggunakan koloid?\n"
            + "\n3. Industri sabun dan deterjen\n" +
            "Sabun dan deterjen merupakan emuglator untuk membentuk emulsi antara kotoran (minyak) dengan air.",
            "Mengapa sabun termasuk ke dalam peran koloid, apa yang menyebabkan hal tersebjut terjadi?\n"
            + "\n4. Kelestarian lingkungan\n" +
            "Untuk mengurangi polusi udara yang disebabkan oleh pabrik-pabrik, digunakan suatu alat yang disebut cotrell. " +
            "Alat ini berfungsi untuk menyerap partikel-partikel koloid yang terdapat dalam gas buangan yang keluar dari " +
            "cerobong asap pabrik.\n" +
            "Simpulkanlah materi peranan koloid dalam kehidupan sehari-hari berdasarkan contoh fenomena yang ada\n"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_materi_four);

        context=this;

        lv=(ListView) findViewById(R.id.materi_four);
        lv.setAdapter(new CostomAdapterFour(this, materi_four, image_four));

    }

    public void funcBack(View view) {
        Intent intent = new Intent(MateriFourActivity.this, MateriActivity.class);
        startActivity(intent);
    }
}
