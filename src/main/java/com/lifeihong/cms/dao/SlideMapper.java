package com.lifeihong.cms.dao;

import com.lifeihong.cms.domain.Slide;

public interface SlideMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Slide record);

	int insertSelective(Slide record);

	Slide selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Slide record);

	int updateByPrimaryKey(Slide record);
}