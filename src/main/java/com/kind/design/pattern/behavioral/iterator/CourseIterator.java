package com.kind.design.pattern.behavioral.iterator;

/**
 * @author zhoujifeng
 * @date 2020/5/10 4:02 下午
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();

}
