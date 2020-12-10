package com.clearminds.model;

public class Persona {
	private String cedula;
	private String nombre;
	private int edad;
	
	
	
	public Persona(String cedula, String nombre, int edad) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(){
		
	}
	
		
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
