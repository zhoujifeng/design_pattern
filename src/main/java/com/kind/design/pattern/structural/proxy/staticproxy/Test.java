package com.kind.design.pattern.structural.proxy.staticproxy;

import com.kind.design.pattern.structural.proxy.Order;

/**
 * @author zhoujifeng
 * @date 2020/5/10 11:27 上午
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();

        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);

    }
}
