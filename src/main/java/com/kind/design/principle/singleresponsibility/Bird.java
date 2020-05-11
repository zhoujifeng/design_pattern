package com.kind.design.principle.singleresponsibility;

/**
 * @author zhoujifeng
 * @date 2020/5/3 10:27 上午
 */
public class Bird {

    public void mainMoveMode(String birdName){

        if("鸵鸟".equals(birdName)){
            System.out.println(birdName + "用脚走");
        }else {
            System.out.println(birdName + "用翅膀飞");
        }

    }
}
