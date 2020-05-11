package com.kind.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author zhoujifeng
 * @date 2020/5/10 4:05 下午
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    public Course nextCourse() {
        System.out.println("返回课程，位置是"+position);
        course = (Course) courseList.get(position);
        position ++;
        return course;


    }

    public boolean isLastCourse() {

        if(position < courseList.size()){
            return false;
        }
        return true;
    }
}
