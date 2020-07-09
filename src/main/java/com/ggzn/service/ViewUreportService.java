package com.ggzn.service;

import com.ggzn.entity.ViewUreportEntity;

public interface ViewUreportService {
	int insertOne(ViewUreportEntity viewUreportEntity);
	String queryNameByID(String id);
}
