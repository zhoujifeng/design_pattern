package com.kind.design.pattern.structural.proxy.proxysourcecode;

/**
 * @author zhoujifeng
 * @date 2020/6/24 5:29 下午
 */
public class HelloServiceImpl implements HelloService {

    public void sayHello() {
        System.out.println("hello , zhoujf");
    }

    @Override
    public String toString() {
        System.out.println("toString");
        return null;
    }
}
