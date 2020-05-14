package com.kind.design.pattern.creational.factorymethod;

/**
 * @author zhoujifeng
 * @date 2020/5/14 12:42 下午
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

}
