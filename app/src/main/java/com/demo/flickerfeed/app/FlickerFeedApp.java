package com.demo.flickerfeed.app;

import android.app.Application;

import com.demo.flickerfeed.di.component.AppComponent;
import com.demo.flickerfeed.di.component.DaggerAppComponent;
import com.demo.flickerfeed.di.module.AppModule;


/**
 * Created by abhiholkar on 22/09/2018.
 */

public class FlickerFeedApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
