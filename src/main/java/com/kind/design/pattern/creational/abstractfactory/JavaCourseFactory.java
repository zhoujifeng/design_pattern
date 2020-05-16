package com.kind.design.pattern.creational.abstractfactory;

/**
 * @author zhoujifeng
 * @date 2020/5/14 8:14 下午
 */
public class JavaCourseFactory implements CourseFactory {

    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }

}
