package com.kind.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author zhoujifeng
 * @date 2020/5/3 5:14 下午
 */
public class Pig implements Cloneable{

    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Pig pig = (Pig) super.clone();
        //深克隆，对象里面的引用对象也要进行克隆
        pig.birthday = (Date)pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}
