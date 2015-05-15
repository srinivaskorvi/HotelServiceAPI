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
		
		Reader rd = null;
		
		try {
			rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}
	    
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
	    
	    List<Hotel> ems = null;

	    try {
	    	
	    	System.out.println("Going to read records.....");
	    	
	    	ems = (List<Hotel>)smc.queryForList("Hotel.getAll", null);
	    	  
	    	System.out.println("Successfully read the records the record count is - " + ems.size());
	    	
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
	    	//e.printStackTrace();
	    };
	    	      
	    return ems;		
	}
}
