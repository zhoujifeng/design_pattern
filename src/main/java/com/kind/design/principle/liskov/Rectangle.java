package com.kind.design.principle.liskov;

/**
 * @author zhoujifeng
 * @date 2020/5/3 11:17 上午
 */
public class Rectangle implements Quadrangle{

    private long length;

    private long width;


    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getWidth() {
        return width;
    }

    public long getLength() {
        return length;
    }
}
