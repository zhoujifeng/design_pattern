package com.kind.design.principle.liskov.methodoutput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoujifeng
 * @date 2020/5/3 11:43 上午
 */
public class Child extends Base {

    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();

        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
