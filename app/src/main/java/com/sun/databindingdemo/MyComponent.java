package com.sun.databindingdemo;

import android.databinding.BindingAdapter;
import android.support.v4.database.DatabaseUtilsCompat;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by sza on 2016/1/8.
 */
    public class MyComponent {
        @BindingAdapter("bind:imageURL")
        public static void loadImage(ImageView image,String url) {
            Picasso.with(image.getContext()).load(url).into(image);
        }

}
