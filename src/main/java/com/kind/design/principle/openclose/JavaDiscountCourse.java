package com.kind.design.principle.openclose;

/**
 * @author zhoujifeng
 * @date 2020/5/3 9:42 上午
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(int id, String name, Double price) {
        super(id, name, price);
    }

    //通过一个子类实现了某些场景的自定义化，而不需要直接修改底层接口
    public Double getDiscountPrice(){
        return super.getPrice() * 0.8;
    }

}
