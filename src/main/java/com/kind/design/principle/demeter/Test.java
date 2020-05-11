package com.kind.design.principle.demeter;

/**
 * @author zhoujifeng
 * @date 2020/5/3 10:58 上午
 */
public class Test {

    public static void main(String[] args) {

        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
