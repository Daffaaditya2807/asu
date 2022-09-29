package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class CompleteText extends AppCompatActivity {
    AutoCompleteTextView edt;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        edt = (AutoCompleteTextView) findViewById(R.id.vieww);
        adapter = ArrayAdapter.createFromResource(this,R.array.countries_arry,
                android.R.layout.simple_list_item_1);
        edt.setAdapter(adapter);
    }
}