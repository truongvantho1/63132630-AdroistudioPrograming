package com.example.baitaptuanhocsoonline;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends  RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<Landscape> listData;

    public LandScapeAdapter(Context context, ArrayList<Landscape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem =  cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder holderCreated = new ItemLandHolder(vItem);

        return holderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        Landscape landscapeHienThi = listData.get(position);
        String caption =landscapeHienThi.getLandViTri();
        String tenAnh = landscapeHienThi.getLandHinhAnh();
        holder.tvCapTion.setText(caption);
        String pakageName =  holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenAnh,"mipmap", pakageName);
        holder.imageViewLandscape.setImageResource(imageID);


    }

    @Override
    public int getItemCount() {

        return listData.size();
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
