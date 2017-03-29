package com.peddi.home.SpringBootReport.dao;

import java.util.List;

import com.peddi.home.SpringBootReport.domain.Report;
import com.peddi.home.SpringBootReport.mapper.ReportsMapper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotyoe.Repository;

@Repository
public class ReportsDAO {

	private static final Logger logger = Logger.getLogger(Application.class
			.getName());

	@Autowired
	private ReportsMapper reportsMapper;

	/*
	 * Gets the result of query from reports mapper and passes the results to as
	 * list of report objects to service layer
	 */
	public List<Report> getCount() {
		if (logger.isDebugEnabled()) {
			logger.debug("Entering ReportsDAO.getCount");
		}
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("Exiting ReportsDAO.getCount");
			}
			return reportsMapper.getCount();
		} catch (Exception e) {
			if (logger.isDebugEnabled()) {
				logger.debug("Error in ReportsDAO.getCount", e);
				return null;
			}
		}
	}
}
