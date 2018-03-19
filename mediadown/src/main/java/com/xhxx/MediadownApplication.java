package com.xhxx;

import com.xhxx.dbconfig.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class MediadownApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediadownApplication.class, args);
	}
}
