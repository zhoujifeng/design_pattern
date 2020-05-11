package com.kind.design.pattern.structural.decorator.v2;

/**
 * @author zhoujifeng
 * @date 2020/5/5 11:05 上午
 */
public class Test {

    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc() + "销售价格 ：" + aBatterCake.cost());


    }
}
