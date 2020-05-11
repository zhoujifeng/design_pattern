package com.kind.design.pattern.structural.facade;

/**
 * @author zhoujifeng
 * @date 2020/5/3 6:17 下午
 */
public class ShippingService {

    public String shipGift(PointGift pointGift){
        //物流系统的对接逻辑
        System.out.println(pointGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
