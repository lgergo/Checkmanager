package com.yevsp8.checkmanager.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gergo on 2018. 02. 25..
 */

@Module
public class ContextModule {

    //external dependency
    private final Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @CustomScope
    Context provideContext() {
        return context;
    }
}

