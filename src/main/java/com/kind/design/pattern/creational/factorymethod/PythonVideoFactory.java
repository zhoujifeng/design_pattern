package com.kind.design.pattern.creational.factorymethod;

/**
 * @author zhoujifeng
 * @date 2020/5/14 12:40 下午
 */
public class PythonVideoFactory extends VideoFactory{


    public Video getVideo() {
        return new PythonVideo();
    }
}
