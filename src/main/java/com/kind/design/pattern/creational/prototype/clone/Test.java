package com.kind.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author zhoujifeng
 * @date 2020/5/3 5:16 下午
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig)pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        //修改pig1的生日，会将pig2的生日一同修改
        //虽然pig1和pig2是两个不同的对象，但是他们共同引用的生日对象是同一个对象
        //所以，修改对象下面的对象的内容时，一定要注意深复制和浅复制引起的不同的结果
        //如果只默认实现当前类的克隆方法，那么就是浅克隆
        pig1.getBirthday().setTime(6666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);

        //todo 原型破坏单例
    }
}
