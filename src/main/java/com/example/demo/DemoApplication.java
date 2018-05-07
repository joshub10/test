package com.example.demo;


import java.text.Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	
	public static void main(String[] args) {
		
//		SpringApplication.run(DemoApplication.class, args);

		
		
//		ApplicationContext context = new FileSystemXmlApplicationContext("config.xml");
//		AbstractApplicationContext context2=(AbstractApplicationContext)context;
		ApplicationContext context2=new AnnotationConfigApplicationContext("com.example.demo");
		

		
//		Persona p = context2.getBean(Persona.class);
//		
//		p.getPersona();
		
		CustomEventPublisher cvp =  context2.getBean("customEventPublisher",CustomEventPublisher.class);
		cvp.publish();
		
//		Persona ip = context2.getBean("persona3",Persona.class);
//		System.out.println("IP1: "+ip+"..."+ip.getDireccion().getDir());
//		ip.getPersona();
//		for (Producto string : ip.getProductos()) {			
//			Consola.mensaje(string.getNombre());
//		}
		
		
//		ip = context.getBean("persona2",Persona.class);
//		System.out.println("IP2: "+ip+"...."+ip.getDireccion());
//		ip.getPersona();
		
//		context2.registerShutdownHook();
		

	}
}
