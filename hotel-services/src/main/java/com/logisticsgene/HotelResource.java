package com.logisticsgene;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.logisticsgene.model.Hotel;
import com.logisticsgene.repository.HotelRepository;
import com.logisticsgene.repository.HotelRepositoryStub;

@Path("hotels")
public class HotelResource {

	private HotelRepository hotelRepository = new HotelRepositoryStub();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Hotel> getAllHotels() {
		return hotelRepository.getAllHotels();
	}
	
}
