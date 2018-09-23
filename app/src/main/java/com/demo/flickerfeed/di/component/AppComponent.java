package com.demo.flickerfeed.di.component;

import com.demo.flickerfeed.di.module.AppModule;
import com.demo.flickerfeed.di.module.ViewModelModule;
import com.demo.flickerfeed.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by abhiholkar on 22/09/2018.
 */

@Singleton
@Component(modules = {AppModule.class, ViewModelModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
