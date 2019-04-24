package com.tapakkur.demo;

/**
 * demo
 * Created by tapakkur on 2019/4/24 15:06
 */

public class A {

    private String title;
    private String content;

    public A() {

    }

    public A (String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "title :" + this.title +
                "\ncontent :" + this.content;
    }
}
