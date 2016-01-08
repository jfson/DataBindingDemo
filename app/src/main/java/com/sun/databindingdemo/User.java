package com.sun.databindingdemo;

import android.view.View;
import android.widget.Toast;

/**
 * Created by sza on 2016/1/8.
 */
public class User  {
    private String name;
    private String email;
    private String phone;
    private String icon;

    public User(String name, String email, String phone, String icon) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    /*public View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            Toast.makeText(v.getContext(),"长击名字",Toast.LENGTH_SHORT).show();
            return true;
        }
    };*/

}
