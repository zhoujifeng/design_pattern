package com.kind.design.pattern.structural.decorator.v2;

/**
 * @author zhoujifeng
 * @date 2020/5/5 10:56 上午
 */
public class BatterCake extends ABatterCake{

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
