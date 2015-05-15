package com.logisticsgene;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.logisticsgene.model.Hotel;
import com.logisticsgene.repository.HotelRepository;
import com.logisticsgene.repository.HotelRepository1;
//import com.logisticsgene.repository.HotelRepositoryStub;

@Path("hotels")
public class HotelResource {

	//private HotelRepository hotelRepository = new HotelRepositoryStub();	
	private HotelRepository hotelRepository;
	private HotelRepository1 hotelRepository1;
	
	//@Inject HotelRepository hotelRepository;
	
	@Inject
	public HotelResource(HotelRepository repository, HotelRepository1 repo) {
		this.hotelRepository = repository;
		this.hotelRepository1 = repo;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Hotel> getAllHotels() {
		return hotelRepository.getAllHotels();
	}
	
	/*
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Hotel> getAllHotels1() {
		return hotelRepository1.getAllHotels();
	}*/
	
}
