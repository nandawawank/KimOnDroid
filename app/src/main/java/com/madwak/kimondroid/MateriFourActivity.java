package com.madwak.kimondroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MateriFourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_materi_four);

        String[] materi_four= getResources().getStringArray(R.array.materi_empat);

        ListView listview =(ListView) findViewById(R.id.materi_four);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, materi_four);
        listview.setAdapter(adapter);
    }
}
