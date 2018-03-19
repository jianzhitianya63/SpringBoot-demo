package com.example.dao;

import com.example.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author: ganduo
 * @description:
 * @date: 23:30 2018/3/19
 */
@Repository
public class PersonDao {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String, String> valueOpsStr;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<Object, Object> valOps;

    public void save(Person person) {
        valOps.set(person.getId(), person);
    }

    public String getString(){
        return valueOpsStr.get("xx");
    }

    public Person getPerson(){
        return (Person) valOps.get("1");
    }

    public void StringRedisTemplateDemo(){
        valueOpsStr.set("xx","yy");
    }

}
