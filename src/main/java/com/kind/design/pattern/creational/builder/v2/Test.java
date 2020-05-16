package com.kind.design.pattern.creational.builder.v2;

/**
 * @author zhoujifeng
 * @date 2020/5/16 3:40 下午
 */
public class Test {

    public static void main(String[] args) {

        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲Video")
                .buildCourseArticle("Java设计模式精讲Article")
                .build();

        System.out.println(course);
    }
}
