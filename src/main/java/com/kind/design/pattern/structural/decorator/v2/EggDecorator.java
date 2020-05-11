package com.kind.design.pattern.structural.decorator.v2;

/**
 * @author zhoujifeng
 * @date 2020/5/5 11:01 上午
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
