package com.lockersoft.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView lessons = null;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView lessons = (ListView)findViewById( R.id.lvLessons);
        adapter = ArrayAdapter.createFromResource(this, R.array.countries_array, android.R.layout.simple_list_item_1);
        lessons.setAdapter( adapter );
    }
}
