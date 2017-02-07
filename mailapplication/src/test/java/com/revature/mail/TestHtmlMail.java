package com.revature.mail;

import com.revature.util.MailUtil;

public class TestHtmlMail {
	public static void main(String[] args) {
		String content = ProjectReportMailer.getContent();
		String subject = "Reg - Holidays Report";
		MailUtil.sendHtmlMail(subject, content);
	}
}
