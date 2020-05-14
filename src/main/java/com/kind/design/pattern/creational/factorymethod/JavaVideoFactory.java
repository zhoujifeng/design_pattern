package com.kind.design.pattern.creational.factorymethod;

/**
 * @author zhoujifeng
 * @date 2020/5/14 12:38 下午
 */
public class JavaVideoFactory extends VideoFactory {


    public Video getVideo() {

        return new JavaVideo();

    }
}
