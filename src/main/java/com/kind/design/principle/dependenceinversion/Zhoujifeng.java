package com.kind.design.principle.dependenceinversion;

/**
 * @author zhoujifeng
 * @date 2020/5/3 9:56 上午
 */
public class Zhoujifeng {

    private ICourse iCourse;

//    public Zhoujifeng(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    //    public void studyJavaCourse(){
//        System.out.println("Zhoujifeng 在学习java课程");
//    }
//
//    public void studyJFECourse(){
//        System.out.println("Zhoujifeng 在学习FE课程");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("Zhoujifeng 在学习Python课程");
//    }


//    public void studyCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }

    public void studyCourse(){
        iCourse.studyCourse();
    }


}
