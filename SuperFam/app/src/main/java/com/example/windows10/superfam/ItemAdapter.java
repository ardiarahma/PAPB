package com.example.windows10.superfam;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 5/3/2018.
 */

public class ItemAdapter extends ArrayAdapter<ItemData> {
    private Context context;
    private ArrayList<ItemData> values;
    public ItemAdapter(@NonNull Context context, ArrayList<ItemData> values) {
        super(context, R.layout.list_item, values);
        this.values = values;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.list_item,parent,false);

        TextView nameText=(TextView)view.findViewById(R.id.text1);
        TextView addressText=(TextView)view.findViewById(R.id.text2);
        TextView distanceText=(TextView)view.findViewById(R.id.text3);
        ImageView imageView=(ImageView)view.findViewById(R.id.image1);

        nameText.setText(values.get(position).itemName);
        addressText.setText(values.get(position).itemAddress);
        distanceText.setText(values.get(position).itemDistance);
        imageView.setImageResource(R.mipmap.ic_launcher);


        return view;
    }

}
