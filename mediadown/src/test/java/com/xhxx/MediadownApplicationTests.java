package com.xhxx;

import com.xhxx.mapper.ArticleMapper;
import com.xhxx.mapper.ArticlesMapper;
import com.xhxx.pojo.Article;
import com.xhxx.service.ArticlesService;
import com.xhxx.validate.WhiteList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MediadownApplicationTests {
	@Autowired
	private ArticleMapper artMapper;

	@Autowired
	private ArticlesService artsService;

	@Autowired
	private WhiteList wl;

	@Test
	public void contextLoads() {
	}

}
