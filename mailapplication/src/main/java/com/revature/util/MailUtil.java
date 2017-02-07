package com.revature.util;

import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import com.revature.dao.EmployeeDAO;

public class MailUtil {
	public static void sendHtmlMail(String subject, String content) {
		try {
			HtmlEmail email = new HtmlEmail();
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("itsmesentamil@gmail.com", "anbusivaammu"));
			email.setDebug(false);
			email.setHostName("smtp.gmail.com");
			email.setFrom("itsmesentamil@gmail.com");
			email.setSubject(subject);
			email.setHtmlMsg(content);
			EmployeeDAO employeeDao = new EmployeeDAO();
			List<String> mail = employeeDao.getEmail();
			for (String m : mail) {
				email.addTo(m);
				email.addTo("senthamild@revature.com");
			}
			email.setTLS(true);
			email.send();
			System.out.println("Mail sent!");
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
