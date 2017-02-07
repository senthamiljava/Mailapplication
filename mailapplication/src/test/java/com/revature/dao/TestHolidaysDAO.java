package com.revature.dao;

import java.util.List;

import com.revature.model.Holiday;

public class TestHolidaysDAO {

	public static void main(String[] args) {
		HolidayDAO holidaysDAO = new HolidayDAO();
		List<Holiday> list = holidaysDAO.holidayList();
		for (Holiday h : list) {
			System.out.println(h);
		}
	}

}
