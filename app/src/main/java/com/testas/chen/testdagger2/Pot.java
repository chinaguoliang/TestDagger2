package com.testas.chen.testdagger2;

import javax.inject.Inject;

/**
 * Created by chen on 2017/5/26.
 */

public class Pot {

    private Rose rose;

    @Inject
    public Pot(Rose rose) {
        this.rose = rose;
    }

    public String show() {
        return rose.whisper();
    }
}