package com.madwak.kimondroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MateriThreActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_materi_thre);

        String[] materi_tiga= getResources().getStringArray(R.array.materi_tiga);

        ListView listview =(ListView) findViewById(R.id.materi_thre);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, materi_tiga);
        listview.setAdapter(adapter);
    }


    public void funcBack(View view) {
//        Intent back = new Intent(MateriThreActivity.this, MateriActivity.class);
//        startActivity(back);
        finish();
    }
}
