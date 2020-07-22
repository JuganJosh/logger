package com.xworkz.logger.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class MailDTO implements Serializable {
	
	private static final Logger LOGGER = Logger.getLogger(MailDTO.class);
	
	private static final long serialVersionUID = 1L;

	private String mail;
	private String subject;
	private String body;

	public MailDTO() {
		//System.out.println("Created \t" + this.getClass().getSimpleName());
		LOGGER.info( "created\t" + this.getClass().getSimpleName());
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
