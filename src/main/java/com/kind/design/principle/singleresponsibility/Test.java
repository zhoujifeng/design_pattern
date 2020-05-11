package com.kind.design.principle.singleresponsibility;

/**
 * @author zhoujifeng
 * @date 2020/5/3 10:28 上午
 */
public class Test {

    public static void main(String[] args) {
//        Bird bird = new Bird();
////        bird.mainMoveMode("大雁");
////        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
