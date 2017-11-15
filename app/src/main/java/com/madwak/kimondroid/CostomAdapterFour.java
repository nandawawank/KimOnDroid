package com.madwak.kimondroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by nandawk on 11/14/17.
 */

public class CostomAdapterFour extends BaseAdapter{

    String[] result;
    Context context;
    Integer[] imageId;
    private static LayoutInflater inflater=null;
    public CostomAdapterFour(MateriFourActivity materifouractivity, String[] materi_four, Integer[] image_four) {
        // TODO Auto-generated constructor stub
        result=materi_four;
        context=materifouractivity;
        imageId=image_four;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_materiempat, null);
        holder.tv=(TextView) rowView.findViewById(R.id.materiempat);
        holder.img=(ImageView) rowView.findViewById(R.id.gambarempat);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}
