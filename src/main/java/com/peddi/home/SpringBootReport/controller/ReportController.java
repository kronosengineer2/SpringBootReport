package com.peddi.home.SpringBootReport.controller;

import com.peddi.home.SpringBootReport.Application;
import com.peddi.home.SpringBootReport.common.CommonConstantsReport;
import com.peddi.home.SpringBootReport.domain.*;
import com.peddi.home.SpringBootReport.service.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 This file processes the request and provides the routing info for any 
 http request matching the method for different queries
 @author Peddi
 @crossorigin provides the sharing of resources among 
 the microservices on different ports
 */

@CrossOrigin
@RestController
public class ReportController {
	// get the actual class name to be printed
	private static final Logger logger = Logger.getLogger(Application.class.getName());
	@Autowired
	private ReportService reportService;

	/*
	 * Spring converts result of query (list of report objects) to JSON
	 */

	@RequestMapping(CommonConstantsReport.REPORT)
	public List<Report> reports() {
		if (logger.isDebugEnabled()) {
			logger.debug("Entering ReportController.reports");
		}
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("Exiting ReportController.reports");
			}
			return reportService.getCount();
		} catch (Exception e) {
			if (logger.isDebugEnabled()) {
				logger.debug("Error in ReportController.reports", e);
				return null;
			}
		}
	}

}
