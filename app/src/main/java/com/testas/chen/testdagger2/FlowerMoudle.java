package com.testas.chen.testdagger2;

import com.testas.chen.testdagger2.customann.JohnFlower;
import com.testas.chen.testdagger2.customann.TomFlower;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chen on 2017/5/26.
 */

@Module
public class FlowerMoudle {
    @Provides
    @TomFlower
    Flower provideTom() {
        return new Tom();
    }

    @Provides
    @JohnFlower
    Flower provideJohn() {
        return new John();
    }
}