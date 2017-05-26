package com.testas.chen.testdagger2;

import com.testas.chen.testdagger2.customann.JohnFlower;
import com.testas.chen.testdagger2.customann.TomFlower;

import dagger.Component;

/**
 * Created by chen on 2017/5/26.
 */

@Component(modules = FlowerMoudle.class)
public interface FlowerComponent {
    @JohnFlower
    Flower getJohnFlower();

    @TomFlower
    Flower getTomFlower();
}