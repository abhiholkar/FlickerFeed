package com.demo.flickerfeed.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.demo.flickerfeed.R;
import com.demo.flickerfeed.adapter.PublicFeedAdapter;
import com.demo.flickerfeed.app.FlickerFeedApp;
import com.demo.flickerfeed.model.Item;
import com.demo.flickerfeed.utils.BundleConstants;
import com.demo.flickerfeed.viewmodel.FlickerFeedViewModel;
import com.demo.flickerfeed.viewmodel.Response;
import com.demo.flickerfeed.viewmodel.ViewModelFactory;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements OnItemClickListener<Item> {

    @BindView(R.id.progress)
    ProgressBar progressBar;

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    @BindView(R.id.errorview)
    TextView errorView;

    @Inject
    ViewModelFactory viewModelFactory;
    private FlickerFeedViewModel flickerFeedViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ButterKnife view injection
        ButterKnife.bind(this);

        //Dagger Dependency injection
        ((FlickerFeedApp) getApplication()).getAppComponent().inject(this);
        flickerFeedViewModel = ViewModelProviders.of(this, viewModelFactory).get(FlickerFeedViewModel.class);

        //Recylcer view layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //View model observe
        flickerFeedViewModel.getFlickerPublicFeeds().observe(this, new Observer<Response>() {

            @Override
            public void onChanged(@Nullable Response response) {
                progressBar.setVisibility(View.GONE);
                if (response!=null && response.getFlickerFeedResponse() != null) {
                    showData(response);
                } else {
                    showError();
                }

            }
        });

    }

    private void showError() {
        recyclerView.setVisibility(View.GONE);
        errorView.setVisibility(View.VISIBLE);
    }

    private void showData(@NonNull Response response) {
        recyclerView.setVisibility(View.VISIBLE);
        PublicFeedAdapter publicFeedAdapter = new PublicFeedAdapter(response.getFlickerFeedResponse().getItems(), this, this);
        recyclerView.setAdapter(publicFeedAdapter);
    }

    @Override
    public void onItemClicked(Item item) {
        Intent detailIntent = new Intent(this, DetailActivity.class);
        detailIntent.putExtra(BundleConstants.ITEM_KEY, item);
        startActivity(detailIntent);

    }
}
