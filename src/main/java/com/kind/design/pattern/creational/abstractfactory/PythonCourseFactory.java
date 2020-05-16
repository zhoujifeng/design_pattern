package com.kind.design.pattern.creational.abstractfactory;



/**
 * @author zhoujifeng
 * @date 2020/5/14 8:21 下午
 */
public class PythonCourseFactory implements CourseFactory {

    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
