package com.revature.mail;

import java.io.StringWriter;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.revature.dao.HolidayDAO;
import com.revature.model.Holiday;


public class ProjectReportMailer {

	public static String getContent() {

		HolidayDAO holidaysDAO = new HolidayDAO();
		List<Holiday> list = holidaysDAO.holidayList();
		
			VelocityEngine ve = new VelocityEngine();
			ve.init();
			VelocityContext context = new VelocityContext();
			Template t = ve.getTemplate("./src/main/java/com/revature/mail/holiday_msg.vm");
			StringWriter writer = new StringWriter();
			context.put("year", "2017");
			context.put("project", "Holidays");
			context.put("PROJECT_REPORT_LIST", list);
			t.merge(context, writer);
			return writer.toString();
			
	}
}
