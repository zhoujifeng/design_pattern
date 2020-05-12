package com.kind.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @author zhoujifeng
 * @date 2020/5/12 12:41 下午
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> article_memento_stack = new Stack<ArticleMemento>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = article_memento_stack.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        article_memento_stack.push(articleMemento);
    }



}
