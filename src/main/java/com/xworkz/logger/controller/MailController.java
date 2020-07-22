package com.xworkz.logger.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.logger.dto.MailDTO;
import com.xworkz.logger.service.MailService;

@Component
@RequestMapping("/")
public class MailController {
	
	private MailService mailservice;
	
	private static final Logger LOGGER = Logger.getLogger(MailController.class);

	public MailController() {
		//System.out.println("Created \t" + this.getClass().getSimpleName());
		LOGGER.info("Created \t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value = "/submit.odc", method = RequestMethod.POST)
	/*public String doMailSend(MailDTO dto, Model model) {
		LOGGER.info("MailId: " + dto.getMail());
		LOGGER.info("Subject: " + dto.getSubject());
		LOGGER.info("Body: " + dto.getBody());
		
		
		model.addAttribute("message", "Mail has been sent successfully...");
		return "/index.jsp";

	}*/
	public String doMailSendSecond(@RequestParam String mail, @RequestParam String subject, @RequestParam String body) {
		try {
			LOGGER.info("Start : Controller");
			LOGGER.info("Mail  : " + mail);
			LOGGER.info("Subject  : " + subject);
			LOGGER.info("Body "+body);
			LOGGER.info("Invoked doMailSendSecond() method from controller");
			LOGGER.info("going to call method from MailServiceImpl :");
			mailservice.message();
			LOGGER.info("This is info message");
			LOGGER.debug("This is debug message");
			LOGGER.warn("This is warn message");
			LOGGER.info("End : Controller");
			throw new ClassNotFoundException("ClassNotFoundException occured");
			}
			catch (Exception e) {
				LOGGER.error("Soemthing went wrong in LoginController",e);
			}
			return "success.jsp";
	}

}
