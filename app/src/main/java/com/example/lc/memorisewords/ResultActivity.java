package com.example.lc.memorisewords;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by LC on 2016/10/7.
 */
public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup);

        ListView listView = (ListView) findViewById(R.id.show);
        Intent intent = getIntent();

        Bundle data = intent.getExtras();

        List<Map<String, String>> list = (List<Map<String, String>>) data.getSerializable("data");

        SimpleAdapter adapter = new SimpleAdapter(ResultActivity.this
                , list
                , R.layout.line, new String[]{"word", "detail"}
                , new int[]{R.id.word, R.id.detail});


        listView.setAdapter(adapter);
    }
}
