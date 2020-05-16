package com.kind.design.pattern.creational.abstractfactory;

/**
 * @author zhoujifeng
 * @date 2020/5/14 8:32 下午
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();

        video.produce();
        article.produce();
    }
}
