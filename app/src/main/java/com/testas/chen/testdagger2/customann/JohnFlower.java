package com.testas.chen.testdagger2.customann;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by chen on 2017/5/26.
 */


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface JohnFlower {}