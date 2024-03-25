package com.example.listview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.listview.Model.Country;
import com.example.listview.R;

import java.util.ArrayList;

public class CountryAdapters extends BaseAdapter {
    ArrayList<Country> listQG;
    Context mContext;
    private LayoutInflater mInflater;
    public CountryAdapters(ArrayList<Country> listQG,
                           Context mContext, LayoutInflater mInflater) {
        this.listQG = listQG;
        this.mContext = mContext;
        mInflater = LayoutInflater.from();
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewTraVe;
        if (convertView == null)
        {
            viewTraVe = mInflater.inflate(R.layout.country_item, null);
        }
        else {

        }
        return null;
    }
}

