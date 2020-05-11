package com.kind.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoujifeng
 * @date 2020/5/3 10:54 上午
 */
public class TeamLeader {

    public void checkCourseNumbers(){

        List<Course> courseList = new ArrayList<Course>();

        for(int i=0;i<20;i++){
            courseList.add(new Course());
        }

        System.out.println("课程的数量为" + courseList.size());

    }
}
