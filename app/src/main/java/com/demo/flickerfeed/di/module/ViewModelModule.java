package com.demo.flickerfeed.di.module;

import android.arch.lifecycle.ViewModel;

import com.demo.flickerfeed.viewmodel.FlickerFeedViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by abhiholkar on 22/09/2018.
 */

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(FlickerFeedViewModel.class)
    abstract ViewModel viewModel(FlickerFeedViewModel countryViewModel);


}
