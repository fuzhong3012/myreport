package com.ggzn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ggzn.entity.UreportFileEntity;

@Mapper
public interface UreportFileMapper {
	/**
	 *  根据报表名称检查报表是否存在
	 * @param name 报表名称
	 * @return
	 */
	public int checkExistByName(String name);
	
	/**
	 *  根据报表名称查询报表
	 * @param name 报表名称
	 * @return
	 */
	public UreportFileEntity queryUreportFileEntityByName(String name);
	
	/**
	 * 查询全部报表
	 * @return 
	 */
	public List<UreportFileEntity> queryReportFileList();
	
	/**
	 * 根据报表名称删除报表
	 * @param name
	 * @return
	 */
	public int deleteReportFileByName(String name);
	
	
	/**
	 *  保存报表
	 */
	public int insertReportFile(UreportFileEntity entity);
	
	/**
	 *  更新报表
	 * @param entity
	 * @return
	 */
	public int updateReportFile(UreportFileEntity entity);
}
