package com.kind.design.pattern.creational.factorymethod;

import com.kind.design.pattern.creational.factorymethod.Video;

/**
 * @author zhoujifeng
 * @date 2020/5/14 12:39 下午
 */
public class JavaVideo extends Video {

    public void produce() {
        System.out.println("录制java课程视频");
    }
}
