package com.testas.chen.testdagger2;

import javax.inject.Inject;

/**
 * Created by chen on 2017/5/26.
 */


public class Rose {
    @Inject
    public Rose() {}

    public String whisper()  {
        return "热恋";
    }
}
