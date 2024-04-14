package com.example.baitaptuanhocsoonline;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class LandScapeAdapter extends  RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemLandHolder extends  RecyclerView.ViewHolder{
        TextView tvCapTion;
        ImageView imageViewLandscape;


        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCapTion = itemView.findViewById(R.id.textView);
            imageViewLandscape = itemView.findViewById(R.id.HinhAnhview);
        }
    }
}
