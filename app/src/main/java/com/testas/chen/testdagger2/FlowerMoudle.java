package com.testas.chen.testdagger2;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chen on 2017/5/26.
 */

@Module
public class FlowerMoudle {
    @Provides
    @Named("Tom")
    Flower provideTom() {
        return new Tom();
    }

    @Provides
    @Named("John")
    Flower provideJohn() {
        return new John();
    }
}