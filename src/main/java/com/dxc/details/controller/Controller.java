package com.dxc.details.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.details.model.Customer;

@RestController
public class Controller {
	
		@RequestMapping("/customer")
		public Customer displayCustomer() {
			Customer customer = new Customer("lucky","sharma","907369346");
			return customer;
		}
	}
