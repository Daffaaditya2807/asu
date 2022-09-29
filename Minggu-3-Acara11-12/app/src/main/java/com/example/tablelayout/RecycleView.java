package com.example.tablelayout;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class RecycleView extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listview;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        listview = (ListView)  findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this,R.array.countries_arry,
                android.R.layout.simple_list_item_1);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.list,menu);
        return true;
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,adapter.getItem(i),Toast.LENGTH_SHORT).show();
    }
}