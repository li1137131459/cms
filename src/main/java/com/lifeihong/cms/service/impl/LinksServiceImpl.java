/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: LinksServiceImpl.java 
 * @Prject: lifeihong-cms
 * @Package: com.lifeihong.cms.service.impl 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月22日 上午10:14:11 
 * @version: V1.0   
 */
package com.lifeihong.cms.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lifeihong.cms.dao.LinksMapper;
import com.lifeihong.cms.domain.Links;
import com.lifeihong.cms.service.LinksService;
import com.lifeihong.cms.util.CMSRuntimeException;
import com.lifeihong.utils.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName: LinksServiceImpl
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月22日 上午10:14:11
 */
@Service
public class LinksServiceImpl implements LinksService {

	@Resource
	private LinksMapper linksMapper;

	/*
	 * (non Javadoc)
	 * 
	 * @Title: insert
	 * 
	 * @Description: TODO
	 * 
	 * @param links
	 * 
	 * @return
	 * 
	 * @see com.lifeihong.cms.service.LinksService#insert(com.lifeihong.cms.domain.Links)
	 */
	@Override
	public boolean insert(Links links) {
		// 检查URl是否合法不合法就抛出自定义异常
		if (!StringUtil.isHttpUrl(links.getUrl()))
			throw new CMSRuntimeException("不是有效URL");
		return linksMapper.insert(links) > 0;
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: selects
	 * 
	 * @Description: TODO
	 * 
	 * @return
	 * 
	 * @see com.lifeihong.cms.service.LinksService#selects()
	 */
	@Override
	public PageInfo<Links> selects(Integer page, Integer pageSize) {

		PageHelper.startPage(page, pageSize);
		List<Links> list = linksMapper.selects();
		PageInfo<Links> pageInfo = new PageInfo<>(list);

		return pageInfo;
	}

}
