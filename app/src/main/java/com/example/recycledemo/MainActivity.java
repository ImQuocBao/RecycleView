package com.example.recycledemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvData;
    private DonutAdapter donutAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvData = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvData.setLayoutManager(linearLayoutManager);

        donutAdapter = new DonutAdapter(this, getListUser());
        rcvData.setAdapter(donutAdapter);

        // add border-bottom for item
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvData.addItemDecoration(itemDecoration);

    }

    private List<Donut> getListUser() {
        List<Donut> arrDonut = new ArrayList<>();

        arrDonut.add(new Donut("Tasty Donut", "Spicy tasty donut family", "$10.00", R.drawable.donut_yellow_1));
        arrDonut.add(new Donut("Pink Donut", "Spicy tasty donut family", "$20.00", R.drawable.pink_donut_1));
        arrDonut.add(new Donut("Floating Donut", "Spicy tasty donut family", "$30.00", R.drawable.green_donut_1));
        arrDonut.add(new Donut("Tasty Donut", "Spicy tasty donut family", "$40.00", R.drawable.donut_red_1));
        return arrDonut;
    }
}