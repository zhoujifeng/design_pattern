package com.kind.design.pattern.creational.builder;

/**
 * @author zhoujifeng
 * @date 2020/5/16 3:28 下午
 */
public class Test {

    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("JAVA设计模式精讲",
                "JAVA设计模式精讲PPT",
                "JAVA设计模式精讲Video",
                "JAVA设计模式精讲Article",
                "JAVA设计模式精讲QA");

        System.out.println(course);
    }
}
