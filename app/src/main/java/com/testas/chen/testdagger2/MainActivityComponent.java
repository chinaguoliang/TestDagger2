package com.testas.chen.testdagger2;

import dagger.Component;

/**
 * Created by chen on 2017/5/26.
 */


@Component(modules = FlowerMoudle.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}