package com.testas.chen.testdagger2;

import com.testas.chen.testdagger2.customann.PerActivity;

import dagger.Component;

/**
 * Created by chen on 2017/5/26.
 */

@PerActivity
@Component(dependencies = PotComponent.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}