package com.kind.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoujifeng
 * @date 2020/5/10 4:03 下午
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    public void addCourse(Course course) {
        this.courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
