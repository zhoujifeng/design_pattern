package com.kind.design.pattern.structural.facade;

/**
 * @author zhoujifeng
 * @date 2020/5/3 6:16 下午
 */
public class PointsPaymentService {

    public boolean pay(PointGift pointGift){

        System.out.println("支付"+ pointGift.getName());
        return true;

    }
}
