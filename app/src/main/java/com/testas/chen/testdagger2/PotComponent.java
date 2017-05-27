package com.testas.chen.testdagger2;

import com.testas.chen.testdagger2.customann.PerActivity;
import com.testas.chen.testdagger2.customann.PotModule;

import dagger.Component;

/**
 * Created by chen on 2017/5/26.
 */

@Component(modules = PotModule.class,dependencies = FlowerComponent.class)
public interface PotComponent {
    Pot getPot();
}