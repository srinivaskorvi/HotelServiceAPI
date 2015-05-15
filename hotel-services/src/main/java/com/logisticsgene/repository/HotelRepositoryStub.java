package com.logisticsgene.repository;


import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import javax.inject.Inject;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.logisticsgene.model.Hotel;

public class HotelRepositoryStub implements HotelRepository {

	public HotelRepositoryStub(){		
	}
	
	/* (non-Javadoc)
	 * @see com.logisticsgene.repository.HotelRepository#getAllHotels()
	 */
	//@Inject
	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> getAllHotels() {
		
		//List<Hotel> hotels = new ArrayList<Hotel>();
		
		Reader rd = null;
		
		System.out.println("Reading SqlMapConfig file.....");
		
		try {
			rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}
	    
		System.out.println("Building SqlMapClient ....." + rd);
		
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
	      
		System.out.println("Building SqlMapClient Done");
		
	    List<Hotel> ems = null;

	    try {
	    	
	    	System.out.println("Going to read records.....");
	    	
	    	ems = (List<Hotel>)smc.queryForList("Hotel.getAll", null);
	    	  
	    	System.out.println("Successfully read the records the record count is - " + ems.size());
	    	
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
	    	//e.printStackTrace();
	    };
	      
	      //Hotel em = null;
			
	      /*for (Hotel e : ems) {
	         System.out.print("  " + e.getName());
	         System.out.print("  " + e.getAddress());	          
	         System.out.println("");
	      } */   

	    System.out.println("Records Read Successfully ");
	      
	    return ems;

		/*
		for (int i = 0; i < 100; i++) {
			
			Hotel hotel = new Hotel();
			hotel.setName("Lemon Tree - " + i);
			hotel.setAddress("Hitech City");
			
			hotels.add(hotel);
		}
		
		Hotel hotel = new Hotel();
		hotel.setName("Lemon Tree");
		hotel.setAddress("Hitech City");
		
		hotels.add(hotel);
			
		Hotel hotel2 = new Hotel();
		hotel2.setName("Taj Banjara");
		hotel2.setAddress("Banjara Hills");
		
		hotels.add(hotel2);
		
		return hotels;*/
	}
	
}
