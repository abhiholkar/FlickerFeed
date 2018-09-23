package com.demo.flickerfeed.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.flickerfeed.R;
import com.demo.flickerfeed.app.GlideApp;
import com.demo.flickerfeed.model.Item;
import com.demo.flickerfeed.view.OnItemClickListener;

import java.util.List;

/**
 * Created by abhiholkar on 22/09/2018.
 */

public class PublicFeedAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    Context context;
    private List<Item> mItems;
    private OnItemClickListener itemClickListener;

    public PublicFeedAdapter(List<Item> mItems, OnItemClickListener itemClickListener, Context activityContext) {
        this.mItems = mItems;
        this.itemClickListener = itemClickListener;
        this.context = activityContext;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemViewHolder holder, int position) {
        final Item item = mItems.get(position);
        holder.name.setText(item.getAuthor());
        GlideApp.with(context)
                .load(item.getMedia().getM())
                .fitCenter()
                .placeholder(R.drawable.photo_unavailable)
                .override(240, 180)
                .error(R.drawable.photo_unavailable)
                .into(holder.imageView);

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(item);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mItems.isEmpty() ? 0 : mItems.size();
    }
}
