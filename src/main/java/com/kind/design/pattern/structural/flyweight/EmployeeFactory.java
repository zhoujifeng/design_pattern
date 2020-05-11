package com.kind.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoujifeng
 * @date 2020/5/6 12:57 下午
 */
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getManager(String department){

        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理:"+ department);
            String reportContent = department + "部门回报，此次报文内容是。。。。";
            manager.setReportContent(reportContent);
            System.out.print("创建报告:"+ reportContent);
            EMPLOYEE_MAP.put(department,manager);

        }

        return manager;
    }
}
