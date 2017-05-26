package com.testas.chen.testdagger2;

import com.testas.chen.testdagger2.customann.JohnFlower;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by chen on 2017/5/26.
 */

public class JudgeHouse {

    private Flower flower;

    @Inject
    public JudgeHouse(@JohnFlower Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
