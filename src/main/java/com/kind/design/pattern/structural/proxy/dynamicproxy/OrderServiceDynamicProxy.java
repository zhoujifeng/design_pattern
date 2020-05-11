package com.kind.design.pattern.structural.proxy.dynamicproxy;

import com.kind.design.pattern.structural.proxy.Order;
import com.kind.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhoujifeng
 * @date 2020/5/10 11:59 上午
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        Object o = Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
        return o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object argObject = args[0];
        beforeMethod(argObject);
        Object obj = method.invoke(target, args);
        return obj;
    }


    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before core");

        if (obj instanceof Order) {
            Order order = (Order)obj;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
