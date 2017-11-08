package com.example.hp_hp.recyclerviewdummy;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP-HP on 8/11/2017.
 */

public class DummyAdapter extends RecyclerView.Adapter<DummyAdapter.ViewHolder> {
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;

        v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.squre_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageView imageView = (ImageView) holder.itemView.findViewById(R.id.picture);
        GlideHelper.easyGlide(imageView,holder.getAdapterPosition());
    }

    @Override
    public int getItemCount() {
        return 5000;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
