package com.peddi.home.SpringBootReport.service;

import java.util.List;

import com.peddi.home.SpringBootReport.controller.Logger;
import com.peddi.home.SpringBootReport.dao.Application;
import com.peddi.home.SpringBootReport.domain.Report;

public class ReportsService {
	
	private static final Logger logger = Logger.getLogger(Application.class.getName());
	@Autowired
	private ReportsDAO reportsDAO;
	
	public List<Report> getCount() {
		if (logger.isDebugEnabled()) {
			logger.debug("Entering ReportsService.getCount");
		}
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("Exiting ReportsService.getCount");
			}
			return ReportsDAO.getCount();
		} catch (Exception e) {
			if (logger.isDebugEnabled()) {
				logger.debug("Error in ReportsService.getCount", e);
				return null;
			}
		}
	}

}
