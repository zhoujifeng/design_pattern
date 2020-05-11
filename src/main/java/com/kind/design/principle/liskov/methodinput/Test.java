package com.kind.design.principle.liskov.methodinput;

import java.util.HashMap;

/**
 * @author zhoujifeng
 * @date 2020/5/3 11:39 上午
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
