package com.madwak.kimondroid;

import android.content.Context;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nandawk on 11/15/17.
 */

public class CostomAdapterTwo extends BaseAdapter{
    String[] result;
    Context context;
    Integer[] imageId;
    private static LayoutInflater inflater=null;
    public CostomAdapterTwo(MateriTwoActivity materitwoactivity, String[] materi_two, Integer[] image_two) {
        // TODO Auto-generated constructor stub
        result=materi_two;
        context=materitwoactivity;
        imageId=image_two;
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
        CostomAdapterTwo.Holder holder=new CostomAdapterTwo.Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_materidua, null);
        holder.tv=(TextView) rowView.findViewById(R.id.materidua);
        holder.img=(ImageView) rowView.findViewById(R.id.gambardua);
        holder.tv.setText(result[position]);
        Linkify.addLinks(holder.tv,Linkify.ALL);
        holder.img.setImageResource(imageId[position]);
//        rowView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
//            }
//        });
        return rowView;
    }

}
