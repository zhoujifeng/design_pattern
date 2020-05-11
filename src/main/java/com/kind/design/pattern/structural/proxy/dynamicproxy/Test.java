package com.kind.design.pattern.structural.proxy.dynamicproxy;

import com.kind.design.pattern.structural.proxy.IOrderService;
import com.kind.design.pattern.structural.proxy.Order;
import com.kind.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author zhoujifeng
 * @date 2020/5/10 2:35 下午
 */
public class Test {

    public static void main(String[] args) {

        Order order = new Order();
        order.setUserId(2);

        IOrderService orderService = (IOrderService) (new OrderServiceDynamicProxy(new OrderServiceImpl()).bind());

        orderService.saveOrder(order);


    }
}
