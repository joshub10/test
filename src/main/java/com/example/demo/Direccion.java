package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Direccion {
	
	@Value( value="calle nula")
	private String dir ="CALLE BRASIL";
	
	public void setDir(String dir) {
		this.dir = dir;
	}
	public Direccion(String dir) {
		this.dir=dir;
	}
	public Direccion() {
		
	}
	
	String getDir() {
		return dir;
	}
}
