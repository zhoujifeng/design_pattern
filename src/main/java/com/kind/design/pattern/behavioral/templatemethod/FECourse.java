package com.kind.design.pattern.behavioral.templatemethod;

/**
 * @author zhoujifeng
 * @date 2020/5/10 3:38 下午
 */
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
