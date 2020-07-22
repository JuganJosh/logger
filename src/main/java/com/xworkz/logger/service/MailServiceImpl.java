package com.xworkz.logger.service;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.xworkz.logger.dto.MailDTO;

@Component
public class MailServiceImpl implements MailService {

	private static final Logger LOGGER = Logger.getLogger(MailServiceImpl.class);

	public MailServiceImpl() {
		// System.out.println("Crreated \t" + this.getClass().getSimpleName());
		LOGGER.info("Craeted \t" + this.getClass().getSimpleName());
	}

	@Override
	public void create(MailDTO maildto) {
		try {
			if (Objects.nonNull(maildto)) {
				LOGGER.info("MailDTO not null");

			} else {
				LOGGER.info("MailDTO is  null");
			}

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

	}

	@Override
	public void message() {
		LOGGER.info("Start : ServiveImpl");
		LOGGER.info("Invoked message() method from service");
		LOGGER.info("End : ServiceImpl");

	}

}
