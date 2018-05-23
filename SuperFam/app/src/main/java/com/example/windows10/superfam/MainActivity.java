package com.example.windows10.superfam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<ItemData>values;
    private ItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);

        values=new ArrayList<>();
        for(int i=1;i<10;i++) {
            ItemData item = new ItemData();
            item.itemName = "Nama " + i;
            item.itemAddress = i + " April 2018";
            item.itemDistance =" km";
            values.add(item);
        }
        adapter=new ItemAdapter(this, values);
        /*ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                R.layout.list_item,
                R.id.text1,values);*/
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(getApplicationContext(), values.get(i).itemTitle,
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
