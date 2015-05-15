package com.logisticsgene;

import javax.servlet.http.HttpServlet;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.logisticsgene.repository.HotelRepository;
import com.logisticsgene.repository.HotelRepository1;
import com.logisticsgene.repository.HotelRepositoryStub;
//import com.logisticsgene.repository.HotelRepositoryStub;
import com.logisticsgene.repository.HotelRepositoryStub1;
//import com.logisticsgene.repository.HotelRepository;
//import com.logisticsgene.repository.HotelRepositoryStub;
//import com.sun.jersey.api.core.PackagesResourceConfig;
//import com.sun.jersey.api.core.ResourceConfig;
//import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class HotelServiceGuiceServletContextListener extends GuiceServletContextListener 
{
	public static Injector injector;
	
	@Override
	protected Injector getInjector() {
		/*return Guice.createInjector(new ServletModule() {
			
			@Override
			protected void configureServlets() {
				// TODO Auto-generated method stub
				//super.configureServlets();
								
				bind(HotelRepository.class).to(HotelRepositoryStub.class);
				
				ResourceConfig rc = new PackagesResourceConfig( "com.logisticsgene" );
				for (Class<?> resource : rc.getClasses()) {
					bind( resource );
				}

				serve("/*" ).with(GuiceContainer.class);
			}
		});*/
		System.out.println("Getting injector");
		
		injector = Guice.createInjector(new ServletModule() {
			
			@Override
			protected void configureServlets() {
				
				bind(HotelResource.class);
				bind(HotelRepository.class).to(HotelRepositoryStub.class);
				bind(HotelRepository1.class).to(HotelRepositoryStub1.class);

				//serve("/*").with(GuiceContainer);
				
			}
			
		});
		
		return injector;
		
		/*injector =  Guice.createInjector(new ServletModule() {
			@Override
			protected void configureServlets() {
				
				/*ResourceConfig rc = new PackagesResourceConfig( "com.logisticsgene" );
				for (Class<?> resource : rc.getClasses()) {
					bind( resource );
				}*/
				
				
				//bind(HotelResource.class);
				//bind(HotelRepository.class).to(HotelRepositoryStub.class);
				
				//serve("/*" ).with(GuiceContainer.class);				
			//}
		//});
		
		//return injector;
	}
	
}
