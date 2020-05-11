package com.kind.design.pattern.creational.prototype.abstractprototype;

/**
 * @author zhoujifeng
 * @date 2020/5/3 5:12 下午
 */
public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
