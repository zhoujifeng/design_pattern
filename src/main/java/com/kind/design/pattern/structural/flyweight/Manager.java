package com.kind.design.pattern.structural.flyweight;

/**
 * @author zhoujifeng
 * @date 2020/5/6 12:55 下午
 */
public class Manager implements Employee {

    private String department;

    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void report() {
        System.out.println(reportContent);
    }
}
