package com.ggzn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ggzn.entity.UreportFileEntity;
import com.ggzn.mapper.UreportFileMapper;
import com.ggzn.service.UreportFileService;

@Service
public class UreportFileServiceImpl implements UreportFileService{
	@Resource
	private UreportFileMapper ureportFileMapper;
	@Override
	public int checkExistByName(String name) {
		
		return ureportFileMapper.checkExistByName(name);
	}

	@Override
	public UreportFileEntity queryUreportFileEntityByName(String name) {
		// TODO Auto-generated method stub
		return ureportFileMapper.queryUreportFileEntityByName(name);
	}

	@Override
	public List<UreportFileEntity> queryReportFileList() {
		// TODO Auto-generated method stub
		return ureportFileMapper.queryReportFileList();
	}

	@Override
	public int deleteReportFileByName(String name) {
		// TODO Auto-generated method stub
		return ureportFileMapper.deleteReportFileByName(name);
	}

	@Override
	public int insertReportFile(UreportFileEntity entity) {
		// TODO Auto-generated method stub
		return ureportFileMapper.insertReportFile(entity);
	}

	@Override
	public int updateReportFile(UreportFileEntity entity) {
		// TODO Auto-generated method stub
		return ureportFileMapper.updateReportFile(entity);
	}

}
