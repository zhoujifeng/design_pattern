package com.kind.design.pattern.creational.builder;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author zhoujifeng
 * @date 2020/5/16 3:17 下午
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();

}
