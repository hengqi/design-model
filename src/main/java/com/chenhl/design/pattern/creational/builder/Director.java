package com.chenhl.design.pattern.creational.builder;

/**
 * 指挥者
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildBody();
        builder.buildHead();
        builder.buildFace();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}
