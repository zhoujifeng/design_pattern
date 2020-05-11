package com.kind.design.pattern.structural.proxy;

/**
 * @author zhoujifeng
 * @date 2020/5/10 11:07 上午
 */
public class OrderDaoImpl implements IOrderDao{
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
