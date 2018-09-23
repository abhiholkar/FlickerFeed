package com.demo.flickerfeed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.demo.flickerfeed.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by abhiholkar on 22/09/2018.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.name)
    public TextView name;

    @BindView(R.id.image)
    ImageView imageView;

    View view;


    public ItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.view = itemView;
    }

    public View getItemView() {
        return view;
    }


}
