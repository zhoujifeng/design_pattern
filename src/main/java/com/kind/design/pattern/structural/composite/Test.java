package com.kind.design.pattern.structural.composite;

/**
 * @author zhoujifeng
 * @date 2020/5/6 8:30 下午
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11d);
        CatalogComponent windowsCourse = new Course("windows课程", 12d);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录",2);
        CatalogComponent design = new Course("java设计模式",66);
        CatalogComponent jvm = new Course("java jvm", 77);
        CatalogComponent spring = new Course("java spring", 88);
        javaCourseCatalog.add(design);
        javaCourseCatalog.add(jvm);
        javaCourseCatalog.add(spring);

        CatalogComponent mainCourseCatalog  = new CourseCatalog("课程主目录",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);
        mainCourseCatalog.print();

    }
}
