package com.springmvclearn.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvclearn.web.dao.Offer;
import com.springmvclearn.web.service.OffersService;

@Controller
public class OfferController {


	
	private OffersService offerservice;

	@Autowired
	public void setService(OffersService offerservice) {
		this.offerservice=offerservice;
	}
	
//	@RequestMapping("/")
//	public String showHome(Model model) {
//		
//		List<Offer> offer=service.getCurrent();
//		model.addAttribute("offers", offer);
//		return "home";
//	}

	
	@RequestMapping("createOffer")
	public String creatOffer(Model model) {
		return "createOffer";
	}

	
	@RequestMapping(value = "offerCreate", method = RequestMethod.POST)
	public String afterCreate(Model model, Offer offer) {
		System.out.println(offer);
		offerservice.create(offer);
		
		
		List<Offer> offers = offerservice.getCurrent();
		model.addAttribute("offers", offers);
		return "offerCreateMessage";
	}
	

	
	@RequestMapping("getOffer")
	public String getUser(@RequestParam("id") String id	) 
	{
		System.out.println(id);
		
		return "selectedOffer";
	}
	


	
	

	@RequestMapping("View")
	public String listUser(Model model) {
		List<Offer> offers = offerservice.getCurrent();
		model.addAttribute("Offers", offers);
		return "offerCreated";
	}

	
	@RequestMapping("editOffer")
	public String editOffer(Model model,HttpServletRequest req) {
		Offer offer = offerservice.findId(new Integer(req.getParameter("id"))); 
		model.addAttribute("offer",offer);
		return "editOffer";
	}
	
	@RequestMapping("/updateOffer")
	public String updateOffer(Model model,Offer offer) {
		offerservice.editOffer(offer);
		List<Offer> offers = offerservice.getCurrent();
		model.addAttribute("Offers", offers);
	return "home";
	}
	
	@RequestMapping("deleteOffer")
	public String updateOffer(Model model,int id) {
		offerservice.deleteOffer(id);
		List<Offer> offers = offerservice.getCurrent();
		model.addAttribute("Offers", offers);
	return "offerCreated";
	}
	

}









