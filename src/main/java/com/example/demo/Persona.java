package com.example.demo;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class Persona implements IPersona,BeanPostProcessor{
	
	@Autowired
	@Qualifier("direccion")
	private Direccion direccionEntrega;
	
	private Direccion direccion;
	private List<Producto> productos;
	
	@Value(value="NONE")
	private String nombre;
	
	
	public Persona() {
		
	}
	
	public Persona(String nombre ) {
		Consola.mensaje("constr: "+nombre);
		this.nombre=nombre;
	}
	
	public Persona(Direccion direccion ) {
		Consola.mensaje("constr: "+direccion);
		this.direccion=direccion;
	}
	
	public Persona(String nombre,Direccion direccion) {
		Consola.mensaje("constr");
		this.nombre=nombre;
		this.direccion=direccion;
	}
	
	//-------------------
	private  void start() {
		Consola.mensaje("start: "+nombre);
	}
	public void destroy() {
		Consola.mensaje("dest");
	}
	
	
	public void getPersona(){
//		Consola.mensaje("Hola :"+nombre+" Direccion: "+direccion.getDir());
		Consola.mensaje("Hola :"+nombre+" Direccion: "+direccion.getDir()+" DireccionEntrega: "+direccionEntrega.getDir());
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Consola.mensaje("beanName:"+beanName+ " bean:"+bean);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {		
		Consola.mensaje("beanName:"+beanName+ " bean:"+bean);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	
	public Direccion getDireccion() {
		return direccion;
	}
	
	@Autowired
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public String getNombre() {
		return nombre;
	}
//	@Required
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(Direccion direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	
}
