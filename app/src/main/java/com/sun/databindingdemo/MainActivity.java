package com.sun.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 给某些控件增加一些功能，比如下载图片
        //DataBindingUtil.setDefaultComponent();

        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //binding.setUser(new User("sun","sun@126.com","12222222222"));
        binding.setVariable(com.sun.databindingdemo.BR.user,new User
                ("sun","sun@126.com","12222222222",
                        "http://c.hiphotos.baidu.com/image/h%3D360/sign=3bf4d46e9a22720e64cee4fc4bcb0a3a/4a36acaf2edda3cc4edac92c03e93901213f92fb.jpg" ,this));

    }
}
