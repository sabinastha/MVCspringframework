package com.springmvclearn.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvclearn.web.dao.Offer;
import com.springmvclearn.web.service.OffersService;

@Controller
public class HomeController {

	private OffersService service;

	@Autowired
	public void setService(OffersService offerservice) {
		service=offerservice;
	}
	
	@RequestMapping("/")
	public String showHome(Model model) {
		List<Offer> offer=service.getCurrent();
	model.addAttribute("offers", offer);
						return "home";
	}

}
