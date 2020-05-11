package com.kind.design.pattern.structural.flyweight;

/**
 * @author zhoujifeng
 * @date 2020/5/6 1:00 下午
 */
public class Test {

    private static final String departments[] = {"RD","QA","PM","DB"};

    public static void main(String[] args) {
//        for(int i=0;i<10;i++){
//            String department = departments[(int)(Math.random() * departments.length)];
//            Manager manager = (Manager) EmployeeFactory.getManager(department);
//            manager.report();
//        }

        //测试Integer中的享元模式
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:"+(a==b));
        System.out.println("c==d:"+(c==d));
    }
}
