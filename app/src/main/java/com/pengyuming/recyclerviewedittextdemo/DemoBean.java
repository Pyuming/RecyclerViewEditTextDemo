package com.pengyuming.recyclerviewedittextdemo;

/**
 * @author pengyuming
 * @version 1.0
 * @Package com.pengyuming.myapplication.demo
 * @Description: TODO (用一句话描述该文件做什么) Date: 2017-02-23  09:51
 */
public class DemoBean {

    private int id;
    private String name;
    private String age;

    public DemoBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
