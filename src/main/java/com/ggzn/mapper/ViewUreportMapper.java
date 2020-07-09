package com.ggzn.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ggzn.entity.ViewUreportEntity;


@Mapper
public interface ViewUreportMapper {
	
	public String queryNameByID(String id);
	public int insertOne(ViewUreportEntity viewUreportEntity);
}
