package com.example.SpringbootActiveMQ.Controller;

import java.util.Date;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.websocket.server.PathParam;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootActiveMQ.Service.SendService;

import data.Person;
import helper.XMLConvert;

@RestController
public class Controller {
	@Autowired
	private SendService sendService;
	
	@GetMapping("/send/{mess}")
	public String sendMessage(@PathVariable("mess") String mess)  {
		sendService.sendMess(mess);
		return mess;
	}

}
