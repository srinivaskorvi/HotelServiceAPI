package com.logisticsgene.repository;

import java.util.ArrayList;
import java.util.List;

import com.logisticsgene.model.Hotel;

public class HotelRepositoryStub1 implements HotelRepository1 {

	/* (non-Javadoc)
	 * @see com.logisticsgene.repository.HotelRepository1#getAllHotels()
	 */
	
	@Override
	public List<Hotel> getAllHotels() {
		
		List<Hotel> hotels = new ArrayList<Hotel>();
				
		Hotel hotel = new Hotel();
		hotel.setName("Westin");
		hotel.setAddress("Mind Space");
		
		hotels.add(hotel);
			
		Hotel hotel2 = new Hotel();
		hotel2.setName("Grand Kakatiya");
		hotel2.setAddress("Panjagutta, Hyderabad");
		
		hotels.add(hotel2);
		
		return hotels;
	}
	
}
