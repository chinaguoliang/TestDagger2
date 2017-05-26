package com.testas.chen.testdagger2;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by chen on 2017/5/26.
 */

public class JudgeHouse {

    private Flower flower;

    @Inject
    public JudgeHouse(@Named("Tom") Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
