package com.kind.design.principle.liskov.methodinput;

import java.util.HashMap;

/**
 * @author zhoujifeng
 * @date 2020/5/3 11:36 上午
 */
public class Base {

    public void method(HashMap map){

        System.out.println("父类被执行");

    }
}
