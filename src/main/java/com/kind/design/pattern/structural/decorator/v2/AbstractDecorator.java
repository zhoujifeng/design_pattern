package com.kind.design.pattern.structural.decorator.v2;

/**
 * @author zhoujifeng
 * @date 2020/5/5 10:57 上午
 */
public abstract class AbstractDecorator extends ABatterCake{

    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }
}
