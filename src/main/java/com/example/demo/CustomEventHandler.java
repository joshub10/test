package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
	
   public void onApplicationEvent(CustomEvent event) {
      System.out.println("CustomEventHandler: "+event.toString()+"");
   }
}