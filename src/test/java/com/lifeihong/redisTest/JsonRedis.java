/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: JsonRedis.java 
 * @Prject: chj-cms
 * @Package: com.chj.cms.test.redis.hello 
 * @Description: TODO
 * @author: chj   
 * @date: 2019年9月5日 上午11:24:15 
 * @version: V1.0   
 */
package com.lifeihong.redisTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lifeihong.cms.domain.Article;
import com.lifeihong.cms.service.ArticleService;

/** 
 * @ClassName: JsonRedis 
 * @Description: TODO
 * @author: chj
 * @date: 2019年9月5日 上午11:24:15  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-beans.xml"})
public class JsonRedis {
	
	@Resource
	private ArticleService articleService;
	
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	
	@Test
	public void test_article() {
		//查询文章对象
		 Article entity1 = articleService.selectByPrimaryKey(26);
		 Article entity2 = articleService.selectByPrimaryKey(27);
		 Article entity3 = articleService.selectByPrimaryKey(28);
		 Article entity4 = articleService.selectByPrimaryKey(29);
		 Article entity5 = articleService.selectByPrimaryKey(20);
		 Article entity6 = articleService.selectByPrimaryKey(31);
//		redisTemplate.opsForValue().set("article_"+entity1.getId(),entity1);
//		redisTemplate.opsForList().rightPush("list", entity1,entity2,entity3);
//		redisTemplate.opsForList().rightPushAll("list", entity1,entity2,entity3,entity4,entity5,entity6);
		redisTemplate.opsForSet().add("sse",123,123,34534,4524432);
		Set<Object> difference = redisTemplate.opsForSet().difference("set","sse");
		for (Object object : difference) {
			System.out.println(object);
		}
		//redisTemplate.opsForHash().putAll(key, m);
	}
	
	
}
