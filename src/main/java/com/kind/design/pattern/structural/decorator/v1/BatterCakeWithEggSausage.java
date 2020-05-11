package com.kind.design.pattern.structural.decorator.v1;

/**
 * @author zhoujifeng
 * @date 2020/5/5 10:49 上午
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
