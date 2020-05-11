package com.kind.design.principle.liskov;

/**
 * @author zhoujifeng
 * @date 2020/5/3 11:18 上午
 */
public class Square implements Quadrangle{

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }


    public long getWidth() {
        return sideLength;
    }

    public long getLength() {
        return sideLength;
    }
}
