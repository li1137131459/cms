/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: VoteServiceImpl.java 
 * @Prject: lifeihong-cms
 * @Package: com.lifeihong.cms.service 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月26日 下午2:11:31 
 * @version: V1.0   
 */
package com.lifeihong.cms.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lifeihong.cms.dao.VoteMapper;
import com.lifeihong.cms.domain.Vote;
import com.lifeihong.cms.service.VoteService;

/**
 * @ClassName: VoteServiceImpl
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月26日 下午2:11:31
 */
@Service
public class VoteServiceImpl implements VoteService {

	@Resource
	private VoteMapper voteMapper;

	/*
	 * (non Javadoc)
	 * 
	 * @Title: selects
	 * 
	 * @Description: TODO
	 * 
	 * @return
	 * 
	 * @see com.lifeihong.cms.service.VoteService#selects()
	 */
	@Override
	public List<Map> select(Integer articleId) {
		// TODO Auto-generated method stub
		return voteMapper.select(articleId);
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: insert
	 * 
	 * @Description: TODO
	 * 
	 * @param vote
	 * 
	 * @return
	 * 
	 * @see com.lifeihong.cms.service.VoteService#insert(com.lifeihong.cms.domain.Vote)
	 */
	@Override
	public int insert(Vote vote) {
		// TODO Auto-generated method stub
		return voteMapper.insert(vote);
	}

}
