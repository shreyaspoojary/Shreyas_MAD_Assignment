package com.example.e_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    EditText ed;
    ListView lv;
    Button bt;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ed = findViewById(R.id.input);
        lv = findViewById(R.id.liv);
        bt = findViewById(R.id.send);

        arrayList = new ArrayList();
        arrayAdapter = new ArrayAdapter(MainActivity6.this, R.layout.right_text,arrayList);

        lv.setAdapter(arrayAdapter);

    }

    public void click(View view){
        String result = ed.getText().toString();
        arrayList.add(result);
        arrayAdapter.notifyDataSetChanged();
    }
}
