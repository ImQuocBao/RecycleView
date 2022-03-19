package com.example.recycledemo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsDonut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_donut);

        String txtName = getIntent().getStringExtra("name");
        String txtDes = getIntent().getStringExtra("des");
        String txtPrice = getIntent().getStringExtra("price");
        int imgMain = getIntent().getIntExtra("img", R.drawable.donut_red_1);

        TextView txtNameView = findViewById(R.id.txtName);
        TextView txtPriceView = findViewById(R.id.txtPrice);
        TextView txtDesView = findViewById(R.id.txtDes);
        ImageView imgViewMain = findViewById(R.id.imgMain);
        txtNameView.setText(txtName);
        txtDesView.setText(txtDes);
        txtPriceView.setText(txtPrice);

        imgViewMain.setImageResource(imgMain);
    }
}