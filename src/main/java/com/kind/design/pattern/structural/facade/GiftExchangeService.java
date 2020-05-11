package com.kind.design.pattern.structural.facade;

/**
 * @author zhoujifeng
 * @date 2020/5/3 6:20 下午
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointGift pointGift){
        if(qualifyService.isAvailable(pointGift)){
            //资格校验通过
            if(pointsPaymentService.pay(pointGift)){
                ///支付完成
                String no = shippingService.shipGift(pointGift);
                System.out.println("礼物兑换成功，快递单号为：" +  no);

            }


        }

    }
}
