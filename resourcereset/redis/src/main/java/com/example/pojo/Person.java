package com.example.pojo;

import java.io.Serializable;

/**
 * @author: ganduo
 * @description:
 * @date: 22:28 2018/3/19
 */
public class Person implements Serializable{
    private String id;
    private Integer age;
    private String name;

    public Person(String id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
