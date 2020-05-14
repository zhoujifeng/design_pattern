package com.kind.design.pattern.creational.factorymethod;

/**
 * @author zhoujifeng
 * @date 2020/5/14 12:44 下午
 */
public class FEVideoFactory extends VideoFactory {

    public Video getVideo() {
        return new FEVideo();
    }
}
