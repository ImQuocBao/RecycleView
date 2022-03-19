package com.example.recycledemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class DonutAdapter extends RecyclerView.Adapter<DonutAdapter.DonutViewHolder> {

    private List<Donut> listDonut;
    private Context context;

    public DonutAdapter(Context context, List<Donut> listDonut) {
        this.listDonut = listDonut;
        this.context = context;
    }

    @NonNull
    @Override
    public DonutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_donuts, parent, false);
        return new DonutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DonutViewHolder donutViewHolder, int position) {

        //set data in position for item
        Donut donut = listDonut.get(position);

        if(donut == null) return;

        donutViewHolder.txtHeader.setText(donut.getDonutName());
        donutViewHolder.txtDes.setText(donut.getDonutDes());
        donutViewHolder.txtPrice.setText(donut.getDonutPrice());
        donutViewHolder.imgMain.setImageResource(donut.getDonutImg());

        donutViewHolder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGotoDetail(donut);
            }
        });
    }

    private void onClickGotoDetail(Donut donut) {
        Intent intent = new Intent(context, DetailsDonut.class);
        intent.putExtra("name", donut.getDonutName());
        intent.putExtra("des", donut.getDonutDes());
        intent.putExtra("price", donut.getDonutPrice());
        intent.putExtra("img", donut.getDonutImg());
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        if(listDonut != null)
            return listDonut.size();
        return 0;
    }

    public class DonutViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout layoutItem;

        private TextView txtHeader;
        private TextView txtDes;
        private TextView txtPrice;
        private ImageView imgMain;

        public DonutViewHolder (@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layout_item);

            txtHeader = itemView.findViewById(R.id.textView_Header);
            txtDes = itemView.findViewById(R.id.textView_des);
            txtPrice = itemView.findViewById(R.id.textView_Price);
            imgMain = itemView.findViewById(R.id.imgView_main);
        }
    }
}
