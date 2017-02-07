package com.revature.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.Holiday;
import com.revature.util.ConnectionUtil;

public class HolidayDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public List<Holiday> holidayList() {
		String sql = "SELECT HOLIDAY_DATE,REASON FROM HOLIDAYS";

		List<Holiday> list = jdbcTemplate.query(sql, (rse, rows) -> {
			Holiday holiday = new Holiday();
			holiday.setHolidayDate(rse.getDate("HOLIDAY_DATE"));
			holiday.setStatus(rse.getString("REASON"));
			return holiday;
		});
		return list;
	}
}
