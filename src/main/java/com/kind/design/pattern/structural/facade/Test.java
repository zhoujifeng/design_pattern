package com.kind.design.pattern.structural.facade;

/**
 * @author zhoujifeng
 * @date 2020/5/3 6:24 下午
 */
public class Test {

    public static void main(String[] args) {

        PointGift pointGift = new PointGift("机械键盘");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
//        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftExchange(pointGift);


    }
}
