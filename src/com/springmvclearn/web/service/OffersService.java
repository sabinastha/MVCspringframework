package com.springmvclearn.web.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.springmvclearn.web.dao.Offer;
import com.springmvclearn.web.dao.OffersDAO;

@Service("offersService")
public class OffersService {

	private OffersDAO offersDao;


	@Autowired
	public void setOffersDAO(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}
	
	public OffersService() {
		System.out.println("Successfully configured Service");
		}
	
	public List<Offer> getCurrent(){
		return offersDao.getOffers();
	}
	

	public boolean create(Offer offer){
	return	offersDao.create(offer);
	}
	
	 public Offer getOffer(int id) {
		 return offersDao.getOffer(id);
	 }
	 
	 public Offer findId(int id) {
		 return offersDao.getOffer(id);
	 }
	 
	 public boolean editOffer(Offer offer) {
		 return offersDao.update(offer);
	 }
	 
	 public boolean deleteOffer(int id) {
		 return offersDao.delete(id);
	 }

	
	
	
}
