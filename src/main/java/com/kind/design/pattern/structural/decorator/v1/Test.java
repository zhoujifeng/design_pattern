package com.kind.design.pattern.structural.decorator.v1;

/**
 * @author zhoujifeng
 * @date 2020/5/5 10:51 上午
 */
public class Test {

    public static void main(String[] args) {

        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + "销售价格 ：" + batterCake.cost());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + "销售价格 ：" + batterCakeWithEgg.cost());

        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + "销售价格 ：" + batterCakeWithEggSausage.cost());
    }
}
