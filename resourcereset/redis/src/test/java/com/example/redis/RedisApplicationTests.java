package com.example.redis;

import com.example.dao.PersonDao;
import com.example.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {
	@Autowired
	PersonDao personDao;
	
	@Test
	public void contextLoads() {
		Person person = new Person("1", 32, "wyf");
		personDao.save(person);
		personDao.StringRedisTemplateDemo();

		String str = personDao.getString();
		personDao.getPerson()
	}

}
