package com.peddi.home.SpringBootReport.mapper;

import com.peddi.home.SpringBootReport.domain.Report;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/*
 * Mapper to work with ReportsMapper.xml to execute query;
 */
@Mapper
public interface ReportsMapper {
	public List<Report> getCount();

}
