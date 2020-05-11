package com.kind.design.principle.openclose;

/**
 * @author zhoujifeng
 * @date 2020/4/29 10:23 下午
 */
public class JavaCourse implements ICourse {

    private int id;
    private String name;
    private Double price;

    public JavaCourse(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

//    public Double getDiscountPrice() {
//        return this.price * 0.8;
//    }
}
