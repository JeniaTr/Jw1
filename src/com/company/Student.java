package com.company;

/**
 * Created by JeniaTr-SL on 31.05.2017.
 */
public class Student {

    private String name;
    private String serName;
    private int age;

    public String getName() {
        return name;
    }
    public String getSerName() {
        return serName;

    }
    public String getAge() {
        return String.valueOf(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String name, String serName, int age) {
        this.name = name;
        this.serName = serName;
        this.age = age;
    }


}
