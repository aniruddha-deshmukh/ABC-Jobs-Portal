package com.Lthan.action;

import javax.mail.*;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.internet.*;

import com.Lithan.users.Admin;
import com.Lithan.users.UserPojo;
import com.opensymphony.xwork2.ActionSupport;

public class MailAction extends ActionSupport {

	private static final long serialVersionUID = -2675732503808798947L;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String execute() throws Exception {
		
		Admin lol = new Admin();
		UserPojo aniruddh = null;
		ResultSet rs = lol.report(email);
		while(rs.next()) {
		aniruddh = new UserPojo();
		aniruddh.setPword(rs.getString("pword"));
		String to = getEmail();
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("eddywork001@gmail.com", "aadeshmukh@001");
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("eddywork001@gmail.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("ABC Jobs Password Reset");
			message.setText("Your Password is:" + aniruddh.getPword());
			Transport.send(message);
			System.out.println("Message Sent to " + getEmail());
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
		}
		return "success";
	}
}