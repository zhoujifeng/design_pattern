package com.kind.design.pattern.creational.prototype.abstractprototype;

/**
 * @author zhoujifeng
 * @date 2020/5/3 5:12 下午
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        B b1 = (B)b.clone();
        System.out.println(b);
        System.out.println(b1);

    }
}
