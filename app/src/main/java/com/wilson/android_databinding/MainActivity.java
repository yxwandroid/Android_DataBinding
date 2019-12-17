package com.wilson.android_databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.wilson.android_databinding.activity.DataBinding2Activity;
import com.wilson.android_databinding.activity.DataBindingActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private List title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        title = new ArrayList<String>();
        title.add("DataBindingActivity");
        title.add("DataBinding2Activity");

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, title);

        lv = findViewById(R.id.lv);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) title.get(position);
                switch (item) {
                    case "DataBindingActivity":

                        startActivity(new Intent(MainActivity.this, DataBindingActivity.class));
                        break;
                    case "DataBinding2Activity":
                        startActivity(new Intent(MainActivity.this, DataBinding2Activity.class));

                        break;
                    default:
                        break;


                }

            }
        });

    }
}
