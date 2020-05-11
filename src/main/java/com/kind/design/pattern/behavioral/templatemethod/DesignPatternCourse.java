package com.kind.design.pattern.behavioral.templatemethod;

/**
 * @author zhoujifeng
 * @date 2020/5/10 3:38 下午
 */
public class DesignPatternCourse extends ACourse {


    void packageCourse() {
        System.out.println("提供课程java源码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
