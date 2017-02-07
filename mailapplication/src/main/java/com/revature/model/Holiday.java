package com.revature.model;

import java.sql.Date;

public class Holiday {

	private Long id;
	private Date holidayDate;
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(Date date) {
		this.holidayDate = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Holidays [id=" + id + ", holidayDate=" + holidayDate + ", status=" + status + "]";
	}

}
