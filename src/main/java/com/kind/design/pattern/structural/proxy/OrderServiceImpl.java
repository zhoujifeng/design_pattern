package com.kind.design.pattern.structural.proxy;

/**
 * @author zhoujifeng
 * @date 2020/5/10 11:08 上午
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;


    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
