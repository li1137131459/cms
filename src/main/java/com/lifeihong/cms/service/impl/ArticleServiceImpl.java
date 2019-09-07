/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ArticleServiceImpl.java 
 * @Prject: lifeihong-cms
 * @Package: com.lifeihong.cms.service.impl 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月15日 下午3:54:47 
 * @version: V1.0   
 */
package com.lifeihong.cms.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lifeihong.cms.dao.ArticleMapper;
import com.lifeihong.cms.domain.Article;
import com.lifeihong.cms.service.ArticleService;

/**
 * @ClassName: ArticleServiceImpl
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月15日 下午3:54:47
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Resource
	private ArticleMapper articleMapper;

	/*
	 * (non Javadoc)
	 * 
	 * @Title: insertSelective
	 * 
	 * @Description: TODO
	 * 
	 * @param record
	 * 
	 * @return
	 * 
	 * @see com.lifeihong.cms.service.ArticleService#insertSelective(com.lifeihong.cms.domain.
	 * Article)
	 */
	@Override
	public int insertSelective(Article record) {
		// TODO Auto-generated method stub
		return articleMapper.insertSelective(record);
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: selectByPrimaryKey
	 * 
	 * @Description: TODO
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 * @see
	 * com.lifeihong.cms.service.ArticleService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Article selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(id);
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: selects
	 * 
	 * @Description: TODO
	 * 
	 * @param article
	 * 
	 * @param page
	 * 
	 * @param pageSize
	 * 
	 * @return
	 * 
	 * @see com.lifeihong.cms.service.ArticleService#selects(com.lifeihong.cms.domain.Article,
	 * java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public PageInfo<Article> selects(Article article, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);

		List<Article> selects = articleMapper.selects(article);

		PageInfo<Article> pageInfo = new PageInfo<>(selects);

		return pageInfo;
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: updateByPrimaryKeySelective
	 * 
	 * @Description: TODO
	 * 
	 * @param record
	 * 
	 * @return
	 * 
	 * @see
	 * com.lifeihong.cms.service.ArticleService#updateByPrimaryKeySelective(com.lifeihong.cms.
	 * domain.Article)
	 */
	@Override
	public int updateByPrimaryKeySelective(Article record) {
		// TODO Auto-generated method stub
		return articleMapper.updateByPrimaryKeySelective(record);
	}

}
