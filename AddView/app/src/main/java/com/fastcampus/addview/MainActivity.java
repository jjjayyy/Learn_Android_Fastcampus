package com.fastcampus.addview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> stringList;
    LayoutInflater layoutInflater;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringList = new ArrayList();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.add("G");
        stringList.add("H");

        container = findViewById(R.id.container);

        layoutInflater = LayoutInflater.from(MainActivity.this);

        for(int i = 0; i < stringList.size(); i++) {
            View view = layoutInflater.inflate(R.layout.list_item_view, null, false);
            TextView itemText = view.findViewById(R.id.item_view_text);
            itemText.setText(stringList.get(i));

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("test","CLICK");
                }
            });

            container.addView(view);
        }

    }
}
