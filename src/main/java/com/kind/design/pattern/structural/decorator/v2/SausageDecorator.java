package com.kind.design.pattern.structural.decorator.v2;

/**
 * @author zhoujifeng
 * @date 2020/5/5 11:00 上午
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
