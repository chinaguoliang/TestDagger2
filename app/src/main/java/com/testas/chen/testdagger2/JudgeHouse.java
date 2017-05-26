package com.testas.chen.testdagger2;

import javax.inject.Inject;

/**
 * Created by chen on 2017/5/26.
 */

public class JudgeHouse {

    private Flower flower;

    @Inject
    public JudgeHouse(Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
