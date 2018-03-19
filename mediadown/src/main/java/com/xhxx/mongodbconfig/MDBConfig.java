package com.xhxx.mongodbconfig;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author: ganduo
 * @description:
 * @date: 22:18 2018/3/19
 */
public class MDBConfig {
    @Bean
    public MongoClient client() {
        MongoClient mongoClient = new MongoClient(new ServerAddress("192.168.225.131"));
        return mongoClient;
    }

    @Bean
    public MongoDbFactory mongoDbFactory() {
        String database = new MongoClientURI("mongodb://192.168.225.131/test").getDatabase();
        return new SimpleMongoDbFactory(client(), database);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) {
        return new MongoTemplate(mongoDbFactory);
    }
}
