package com.testas.chen.testdagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chen on 2017/5/26.
 */

@Module
public class FlowerMoudle {
    @Provides
    Flower provideFlower() {
        return new Tom();
    }
}