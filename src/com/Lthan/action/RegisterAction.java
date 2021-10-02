package com.Lthan.action;
import com.Lithan.users.Admin;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 3909481227245439843L;
	private String ufname;
	private String ulname;
	private String uemail;
	private String unum;
	private String ubasequali;
	private String pword;
	private String country;	
	private String msg = "";
	Admin admin = null;
	int ctr = 0;
	
	public String execute() throws Exception {
		
		String to = getUemail();
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
	           message.setSubject("Abc Jobs Pvt");
	           message.setText("ABC Jobs Welcomes you to it's community, you have successfully Registered !!");
	           Transport.send(message);
	           System.out.println("message sent to " + getUemail());
	       }catch (MessagingException e) {
	           throw new RuntimeException(e);
	       }
		try {
			ctr = Admin.register(this);
			if (ctr > 0) {
				msg = "Registration Successfull";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "register";
	}
	

	public RegisterAction() {
		
	}
	
	public String getUfname() {
		return ufname;
	}
	
	public void setUfname(String ufname) {
		this.ufname = ufname;
	}
	
	public String getUlname() {
		return ulname;
	}
	
	public void setUlname(String ulname) {
		this.ulname = ulname;
	}
	
	public String getUemail() {
		return uemail;
	}
	
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	
	public String getUnum() {
		return unum;
	}
	
	public void setUnum(String unum) {
		this.unum = unum;
	}
	
	public String getUbasequali() {
		return ubasequali;
	}
	
	public void setUbasequali(String ubasequali) {
		this.ubasequali = ubasequali;
	}
	
	public String getPword() {
		return pword;
	}
	
	public void setPword(String pword) {
		this.pword = pword;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	} 
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

}

