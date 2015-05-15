package com.logisticsgene;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

import com.google.inject.Injector;

public class GuiceConfig extends ResourceConfig 
{	

	@Inject 
	public GuiceConfig(ServiceLocator serviceLocator, ServletContext servletContext) {
		
		packages(this.getClass().getPackage().getName());
		
		System.out.println("Registering injectables...");
				
		GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator); 
		
		GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class); 
		
		System.out.println(servletContext.getAttribute(Injector.class.getName()));
		
		guiceBridge.bridgeGuiceInjector(HotelServiceGuiceServletContextListener.injector);
		
		System.out.println("Registered injectables...");		
	}
	
}
