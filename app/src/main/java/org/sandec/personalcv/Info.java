package org.sandec.personalcv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Info extends AppCompatActivity {
    private RecyclerView rvInfo;
    private ArrayList<Information> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        rvInfo = findViewById(R.id.rv_info);
        rvInfo.setHasFixedSize(true);

        list.addAll(InfoData.getListData());
        showListAdapter();
    }

    private void showListAdapter() {
        rvInfo.setLayoutManager(new LinearLayoutManager(this));
        InfoCardAdapter infoCardAdapter = new InfoCardAdapter(list);
        rvInfo.setAdapter(infoCardAdapter);
    }
}
