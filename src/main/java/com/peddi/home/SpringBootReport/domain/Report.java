package com.peddi.home.SpringBootReport.domain;

/*
 * POJO for holding each result of report query which has timestamp and count
 */
public class Report {
	private String timestamp;
	private long count;

	/*
	 * Default constructor
	 */
	public Report() {

	}

	/*
	 * parameterized constructor
	 */
	public Report(String timestamp, long count) {
		this.timestamp = timestamp;
		this.count = count;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}
