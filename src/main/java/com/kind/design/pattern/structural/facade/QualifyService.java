package com.kind.design.pattern.structural.facade;

/**
 * @author zhoujifeng
 * @date 2020/5/3 6:14 下午
 */
public class QualifyService {

    public boolean isAvailable(PointGift pointGift){
        System.out.println("校验"+pointGift.getName()+" 积分资格通过，库存通过");
        return true;

    }
}
