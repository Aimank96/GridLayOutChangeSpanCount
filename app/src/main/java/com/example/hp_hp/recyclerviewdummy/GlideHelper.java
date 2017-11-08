package com.example.hp_hp.recyclerviewdummy;

import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * Created by HP-HP on 21/9/2017.
 */

public class GlideHelper {
    public static void easyGlide(ImageView imageView, int adapterPosition) {


    if(adapterPosition%3==1) {
        Glide.with(imageView.getContext())
                .load(R.drawable.img2)
                .asBitmap()
                .dontAnimate()
                .placeholder(R.drawable.img2)
                .into(imageView);
    }else if(adapterPosition%3==2){
        Glide.with(imageView.getContext())
                .load(R.drawable.img5)
                .asBitmap()
                .dontAnimate()
                .placeholder(R.drawable.img5)
                .into(imageView);
    }else {
        Glide.with(imageView.getContext())
                .load(R.drawable.ic_launcher_background)
                .asBitmap()
                .dontAnimate()
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);
    }
    }

}

