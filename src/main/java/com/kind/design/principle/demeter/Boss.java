package com.kind.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoujifeng
 * @date 2020/5/3 10:54 上午
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){

        teamLeader.checkCourseNumbers();
    }
}
