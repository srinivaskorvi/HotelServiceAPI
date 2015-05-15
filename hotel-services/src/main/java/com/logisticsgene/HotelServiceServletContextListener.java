package com.logisticsgene;

//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;

//import com.google.inject.Guice;
//import com.google.inject.Injector;
//import com.logisticsgene.repository.HotelRepository;
//import com.logisticsgene.repository.HotelRepositoryStub;

public class HotelServiceServletContextListener //implements ServletContextListener 
{
	/*
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
	
		System.out.println("ServletContextListener initialized");
		
		//Guice.createInjector(new MyModule(), new JerseyModule()).getInstance(WebServer.class).startJoin();
		Guice.createInjector(new GuiceModule());
		
		Injector injector = Guice.createInjector(new GuiceModule());
		
		HotelRepository repo = injector.getInstance(HotelRepositoryStub.class);
		
		for (Hotel hotel : repo.getAllHotels())
		{
			System.out.println(hotel.getName());
		}
			
	}*/
	
	/*@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		System.out.println("ServletContextListener destroyed");
		
	}*/
	
}
