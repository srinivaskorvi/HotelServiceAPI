package com.logisticsgene;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.logisticsgene.repository.HotelRepository;
import com.logisticsgene.repository.HotelRepository1;
import com.logisticsgene.repository.HotelRepositoryStub;
import com.logisticsgene.repository.HotelRepositoryStub1;

public class HotelServiceGuiceServletContextListener extends GuiceServletContextListener 
{
	public static Injector injector;
	
	@Override
	protected Injector getInjector() {
		
		injector = Guice.createInjector(new ServletModule() {
			
			@Override
			protected void configureServlets() {
				
				bind(HotelResource.class);
				bind(HotelRepository.class).to(HotelRepositoryStub.class);
				bind(HotelRepository1.class).to(HotelRepositoryStub1.class);
				
			}
			
		});
		
		return injector;		
	}
}
