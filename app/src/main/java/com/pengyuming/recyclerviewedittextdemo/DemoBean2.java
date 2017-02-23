package com.pengyuming.recyclerviewedittextdemo;

/**
 * @author pengyuming
 * @version 1.0
 * @Package com.pengyuming.myapplication.demo
 * @Description: TODO (用一句话描述该文件做什么) Date: 2017-02-23  16:24
 */
public class DemoBean2 {

    public DemoBean2(String name) {
        this.name = name;
    }

    private String name;

    private boolean isShow;

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
