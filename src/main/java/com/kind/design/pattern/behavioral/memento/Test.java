package com.kind.design.pattern.behavioral.memento;

/**
 * @author zhoujifeng
 * @date 2020/5/12 12:44 下午
 */
public class Test {

    public static void main(String[] args) {

        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("如影随行的设计模式A","手记内容A","手记图片A");

        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("手记完整内容"+article);

        System.out.println("修改手记start");

        article.setTitle("如影随行的设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");

        System.out.println("修改手记end");
        System.out.println("手记完整内容"+article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("如影随行的设计模式C");
        article.setContent("手记内容C");
        article.setImgs("手记图片C");

        System.out.println("暂存回退start");

        ArticleMemento memento = articleMementoManager.getMemento();
        article.undoFromMemento(memento);
        System.out.println("回退出栈1次");

        memento = articleMementoManager.getMemento();
        article.undoFromMemento(memento);
        System.out.println("回退出栈2次");


        System.out.println("暂存回退end");

        System.out.println("手记完整内容"+article);



    }
}
