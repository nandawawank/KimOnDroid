package com.madwak.kimondroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MateriOneActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_materi_one);

        String[] materi_one= getResources().getStringArray(R.array.materi_satu);

        ListView listview =(ListView) findViewById(R.id.materi_one);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, materi_one);
        listview.setAdapter(adapter);
    }


    public void funcBack(View view) {
        Intent back = new Intent(MateriOneActivity.this, MateriActivity.class);
        startActivity(back);
        finish();
    }
}
