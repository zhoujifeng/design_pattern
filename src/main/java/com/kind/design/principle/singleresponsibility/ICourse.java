package com.kind.design.principle.singleresponsibility;

/**
 * @author zhoujifeng
 * @date 2020/5/3 10:36 上午
 */
public interface ICourse {

    String courseName();

    byte[] courseVideo();

    void studyCourse();

    void refundCourse();
}
