package com.ggzn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ggzn.entity.ViewUreportEntity;
import com.ggzn.mapper.ViewUreportMapper;
import com.ggzn.service.ViewUreportService;

@Service
public class ViewUreportServiceImpl implements ViewUreportService{
	@Resource
	private ViewUreportMapper viewUreportMapper;
	@Transactional
	public int insertOne(ViewUreportEntity viewUreportEntity) {
		int i = 0;
		String name = viewUreportMapper.queryNameByID(viewUreportEntity.getId());
		if(name==null || name.isEmpty()){
			i = viewUreportMapper.insertOne(viewUreportEntity);
		}
		return i;
	}
	@Override
	public String queryNameByID(String id) {
		String name = viewUreportMapper.queryNameByID(id);
		return name;
	}

}
