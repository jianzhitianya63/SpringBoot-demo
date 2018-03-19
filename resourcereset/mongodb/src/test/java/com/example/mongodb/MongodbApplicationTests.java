package com.example.mongodb;

import com.example.mongodb.dao.PerSonRepository;
import com.example.mongodb.pojo.Location;
import com.example.mongodb.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.LinkedHashSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbApplicationTests {
	@Autowired
	PerSonRepository perSonRepository;

	@Test
	public void contextLoads() {
		Person p = new Person("wyf", 32);
		Collection<Location> locations = new LinkedHashSet<>();
		Location loc1 = new Location("上海", "2009");
		Location loc2 = new Location("合肥", "2010");
		Location loc3 = new Location("广州", "2011");
		Location loc4 = new Location("马鞍山", "2012");
		locations.add(loc1);
		locations.add(loc2);
		locations.add(loc3);
		locations.add(loc4);
		p.setLocations(locations);
		perSonRepository.save(p);
		//perSonRepository.findByName("wyf");
		perSonRepository.withQueryFindByAge(32);
	}

}
