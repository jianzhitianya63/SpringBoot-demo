package com.xhxx.dao;

import com.xhxx.pojo.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author: ganduo
 * @description:
 * @date: 22:27 2018/3/19
 */
public interface PerSonRepository extends MongoRepository<Person, String>{
    Person findByName(String name);

    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);
}
