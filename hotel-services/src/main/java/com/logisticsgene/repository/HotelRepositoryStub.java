package com.logisticsgene.repository;

import java.util.ArrayList;
import java.util.List;

import com.logisticsgene.model.Hotel;

public class HotelRepositoryStub implements HotelRepository {

	/* (non-Javadoc)
	 * @see com.logisticsgene.repository.HotelRepository#getAllHotels()
	 */
	@Override
	public List<Hotel> getAllHotels() {
		
		List<Hotel> hotels = new ArrayList<Hotel>();
		
		Hotel hotel = new Hotel();
		hotel.setName("Lemon Tree");
		hotel.setAddress("Hitech City");
		
		hotels.add(hotel);
			
		Hotel hotel2 = new Hotel();
		hotel2.setName("Taj Banjara");
		hotel2.setAddress("Banjara Hills");
		
		hotels.add(hotel2);
		
		return hotels;
	}
	
}
