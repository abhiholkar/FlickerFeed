package com.demo.flickerfeed.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.demo.flickerfeed.R;
import com.demo.flickerfeed.app.GlideApp;
import com.demo.flickerfeed.model.Item;
import com.demo.flickerfeed.utils.BundleConstants;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by abhiholkar on 22/09/2018.
 */

public class DetailActivity extends BaseActivity {

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.detailimage)
    ImageView imageView;

    @BindView(R.id.author)
    TextView author;

    @BindView(R.id.date)
    TextView date;

    @BindView(R.id.description)
    TextView description;

    private Item item;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        item = getIntent().getParcelableExtra(BundleConstants.ITEM_KEY);
        setTitle(getString(R.string.feed_detail));
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (item != null) {

            showDetails();
        }
    }

    private void showDetails() {
        if (!TextUtils.isEmpty(item.getTitle())) {
            title.setText(Html.fromHtml(item.getTitle()));
        }
        author.setText(item.getAuthor());
        description.setText(Html.fromHtml(item.getDescription()));
        date.setText(item.getDateTaken());

        GlideApp.with(this)
                .load(item.getMedia().getM())
                .fitCenter()
                .placeholder(R.drawable.photo_unavailable)
                .override(480, 360)
                .error(R.drawable.photo_unavailable)
                .into(imageView);
    }
}
