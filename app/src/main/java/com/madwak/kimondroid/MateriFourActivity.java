package com.madwak.kimondroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
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
            R.drawable.imgmaterisatu,R.drawable.imgmateridua,R.drawable.imgmateritiga,R.drawable.imgmateriempat};
    public static String[] materi_four={
            "Dalam kehidupan sehari-hari banyak kegunaan koloid baik langsung maupun tidak langsung. Beberapa kegunaan koloid\n" +
            "adalah sebagai berikut:\\n\n" +
            "1. Industri kosmetika\n" +
            "   Bahan kosmetika seperti foundation, finishing cream, dan deodorant berbentuk koloid dan umumnya sebagai emulsi.",
            "2. Industri tekstil\n" +
            "   Pada proses pencelupan bahan (untuk pewarnaan) yang kurang baik daya serapnya terhadap zat warna dapat menggunakan\n" +
            "   zat warna koloid karena memiliki daya serap yang tinggi sehingga dapat melekat pada tekstil.",
            "3. Industri sabun dan deterjen\n" +
            "   Sabun dan deterjen merupakan emulgator untuk membentuk emulsi antara kotoran (minyak) dengan air.",
            "4. Kelestarian lingkungan\n" +
            "   Untuk mengurangi polusi udara yang disebabkan oleh pabrik-pabrik, digunakan suatu alat yang disebut cotrell.\n" +
            "   Alat ini berfungsi untuk menyerap partikel-partikel koloid yang terdapat dalam gas buangan yang keluar dari\n" +
            "   cerobong asap pabrik."
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
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
*/
}
