package com.example.controller;

import com.example.dao.PersonDao;
import com.example.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ganduo
 * @description:
 * @date: 23:48 2018/3/19
 */
@RestController
public class DataController {
    @Autowired
    PersonDao personDao;

    @RequestMapping("/set")
    public void set() {
        Person person = new Person("1", 32, "wyf");
        personDao.save(person);
        personDao.StringRedisTemplateDemo();
    }

    @RequestMapping("/getStr")
    public String getStr(){
        return personDao.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return personDao.getPerson();
    }
}
