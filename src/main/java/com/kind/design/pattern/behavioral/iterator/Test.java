package com.kind.design.pattern.behavioral.iterator;

/**
 * @author zhoujifeng
 * @date 2020/5/10 4:12 下午
 */
public class Test {

    public static void main(String[] args) {

        Course course1 = new Course("java 一期");
        Course course2 = new Course("java 二期");
        Course course3 = new Course("java 设计模式");
        Course course4 = new Course("python");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");


        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("-----课程列表---");
        printCourses(courseAggregate);


        courseAggregate.removeCourse(course1);
        courseAggregate.removeCourse(course2);

        System.out.println("-----删除之后的课程列表---");
        printCourses(courseAggregate);




    }

    private static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
