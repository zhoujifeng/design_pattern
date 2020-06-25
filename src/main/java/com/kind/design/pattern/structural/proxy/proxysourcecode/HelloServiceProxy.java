package com.kind.design.pattern.structural.proxy.proxysourcecode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhoujifeng
 * @date 2020/6/24 5:31 下午
 */
public class HelloServiceProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target, Class[] interfaces){
        this.target = target;
        //Proxy.newProxyInstance 用于指定类装载器，一组接口，和调用处理器，动态生成动态代理类实例
        return Proxy.newProxyInstance
                (target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        System.out.println("*********这里是动态的代理**********");
        //反射方法前调用
        System.out.println("调用前");
        result = method.invoke(target,args);
        //反射方法后调用
        System.out.println("调用后");

        return result;
    }

}
