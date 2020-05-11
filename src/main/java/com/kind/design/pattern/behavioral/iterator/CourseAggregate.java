package com.kind.design.pattern.behavioral.iterator;

/**
 * @author zhoujifeng
 * @date 2020/5/10 4:01 下午
 */
public interface CourseAggregate {


    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
