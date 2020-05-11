package com.kind.design.principle.dependenceinversion;

/**
 * @author zhoujifeng
 * @date 2020/5/3 9:58 上午
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        Zhoujifeng zhoujifeng = new Zhoujifeng();
//        zhoujifeng.studyJavaCourse();
//        zhoujifeng.studyJFECourse();
//    }

    //v2 通过上层传参来影响结果
//    public static void main(String[] args) {
//        Zhoujifeng zhoujifeng = new Zhoujifeng();
//        zhoujifeng.studyCourse(new JavaCourse());
//        zhoujifeng.studyCourse(new FECourse());
//        zhoujifeng.studyCourse(new PythonCourse());
//    }

    //v3 通过构造器
//    public static void main(String[] args) {
//        Zhoujifeng zhoujifeng = new Zhoujifeng(new JavaCourse());
//        zhoujifeng.studyCourse();
//    }

    //v4 通过set方法
    public static void main(String[] args) {
        Zhoujifeng zhoujifeng = new Zhoujifeng();
        zhoujifeng.setiCourse(new JavaCourse());
        zhoujifeng.studyCourse();
    }




}
