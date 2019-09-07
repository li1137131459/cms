/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: HelloRedis.java 
 * @Prject: chj-cms
 * @Package: com.chj.cms.test.redis.hello 
 * @Description: TODO
 * @author: chj   
 * @date: 2019年9月5日 上午10:56:54 
 * @version: V1.0   
 */
package com.lifeihong.redisTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * @ClassName: HelloRedis 
 * @Description: TODO
 * @author: chj
 * @date: 2019年9月5日 上午10:56:54  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-beans.xml"})
public class HelloRedis {
	
	@Resource
	private RedisTemplate<String, String> redisTemplate;
	
	
	@Test
	public void test_hi() {
		//数据存储  opsForValue //string类型        
		redisTemplate.opsForValue().set("name", "chjx");
	}

}
