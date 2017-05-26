package com.testas.chen.testdagger2.customann;

import com.testas.chen.testdagger2.Flower;
import com.testas.chen.testdagger2.Pot;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chen on 2017/5/26.
 */

@Module
public class PotModule {

    @Provides
    Pot providePot(@JohnFlower Flower flower) {
        return new Pot(flower);
    }
}