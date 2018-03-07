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
 * Created by Ahmad on 17-Nov-17.
 */

public class CustomAdapterOne extends BaseAdapter {
    String[] result;
    Context context;
    Integer[] imageId;
    private static LayoutInflater inflater = null;

    public CustomAdapterOne(MateriOneActivity materioneactivity, String[] materi_one, Integer[] image_one) {
        // TODO Auto-generated constructor stub
        result = materi_one;
        context = materioneactivity;
        imageId = image_one;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

    public class Holder {
        TextView tv;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View rowView;
        CustomAdapterOne.Holder holder = new CustomAdapterOne.Holder();

        rowView = inflater.inflate(R.layout.list_materisatu, null);
        holder.tv = (TextView) rowView.findViewById(R.id.materisatu);
        holder.img = (ImageView) rowView.findViewById(R.id.gambarsatu);
        holder.tv.setText(result[position]);
        Linkify.addLinks(holder.tv, Linkify.ALL);
        holder.img.setImageResource(imageId[position]);
        return rowView;
    }
}
