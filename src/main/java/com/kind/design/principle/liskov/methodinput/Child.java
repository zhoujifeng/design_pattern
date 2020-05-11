package com.kind.design.principle.liskov.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoujifeng
 * @date 2020/5/3 11:37 上午
 */
public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    public void method(Map map){
        System.out.println("子类Map入参方法被执行");
    }


}
