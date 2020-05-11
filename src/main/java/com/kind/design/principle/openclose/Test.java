package com.kind.design.principle.openclose;

/**
 * @author zhoujifeng
 * @date 2020/4/29 10:25 下午
 */
public class Test {

    public static void main(String[] args) {

        ICourse javaCourse = new JavaDiscountCourse(96,"设计模式",348d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse)javaCourse;
        System.out.println("课程:"+javaCourse.getId()
                        +" 课程名称:"+javaCourse.getName()
                        +" 课程原价:"+javaCourse.getPrice()
                        +" 课程折后价格:"+ discountCourse.getDiscountPrice() );


    }
}
