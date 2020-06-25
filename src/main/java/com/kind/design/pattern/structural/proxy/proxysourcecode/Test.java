package com.kind.design.pattern.structural.proxy.proxysourcecode;

/**
 * @author zhoujifeng
 * @date 2020/6/24 5:35 下午
 */
public class Test {

    public static void main(String[] args) {
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
        HelloService service = new HelloServiceImpl();
        HelloService serviceProxy = (HelloService) helloServiceProxy.bind(service,new Class[]{HelloService.class});

        serviceProxy.sayHello();
    }
}
