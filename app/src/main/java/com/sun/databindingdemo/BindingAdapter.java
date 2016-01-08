package com.sun.databindingdemo;

import android.databinding.DataBindingUtil;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by sza on 2016/1/8.
 */
public class BindingAdapter<T> extends BaseAdapter {
    private List<T> list;
    private int layoutId;


    public BindingAdapter(List<T> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView!=null){

        }
        return null;
    }
}
