package com.sun.databindingdemo;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sza on 2016/1/8.
 */
public class User extends BaseObservable {
    @Bindable
    private String name;        // 观察者观察name，name会变化的;下面刷新局部的UI会有提示（ @Bindable的作用）
    private String email;
    private String phone;
    private String icon;
    private ArrayAdapter<String> adapter;

    public User(String name, String email, String phone, String icon, Context context) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.icon = icon;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.format("---%03d", i));
        }
        adapter = new ArrayAdapter<String>
                (context, android.R.layout.simple_list_item_1, list);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // 名字变了。通知页面刷新
        notifyPropertyChanged(com.sun.databindingdemo.BR.name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void clickIcon(View view){
        Toast.makeText(view.getContext(),"点击头像",Toast.LENGTH_SHORT).show();
    }

    public void clickName(View view){
        Toast.makeText(view.getContext(),"点击名字",Toast.LENGTH_SHORT).show();
    }

    public boolean longClickName(View view){
        Toast.makeText(view.getContext(),"长按名字",Toast.LENGTH_SHORT).show();
        return true;
    }

    public void itemClick(AdapterView<?> adapterView,View view,int position,long id){
        Toast.makeText(view.getContext(),adapter.getItem(position),Toast.LENGTH_SHORT).show();
    }

    public ArrayAdapter<String> getAdapter() {
        return adapter;
    }

    public void setAdapter(ArrayAdapter<String> adapter) {
        this.adapter = adapter;
    }

/*public View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            Toast.makeText(v.getContext(),"长击名字",Toast.LENGTH_SHORT).show();
            return true;
        }
    };*/

}
