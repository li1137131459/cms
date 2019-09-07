/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: LinksServiceImplTest.java 
 * @Prject: lifeihong-cms
 * @Package: com.lifeihong.cms.service.impl 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月22日 上午10:26:15 
 * @version: V1.0   
 */
package com.lifeihong.cms.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.github.pagehelper.PageInfo;
import com.lifeihong.cms.domain.Links;
import com.lifeihong.cms.service.LinksService;

/** 
 * @ClassName: LinksServiceImplTest 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月22日 上午10:26:15  
 */
public class LinksServiceImplTest  extends JunitParent{
	
	
	@Resource
	
	private LinksService  linksService;

	@Test
	public void testInsert() {
		Links links = new Links();
		links.setText("京东");
		links.setUrl("https://www.啊啊啊啊啊啊啊jd.com");
		links.setCreated(new Date());
		linksService.insert(links);
	}

	@Test
	public void testSelects() {
		PageInfo<Links> info = linksService.selects(1, 3);
		System.out.println(info.getList());
		
	}

}
