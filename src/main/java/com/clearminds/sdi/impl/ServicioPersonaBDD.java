package com.clearminds.sdi.impl;

import com.clearminds.sdi.interfaces.ServicioPersona;
import com.clearminds.sdi.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{
	
	public boolean insertar(Persona persona){
		System.out.println("Insertando persona en la bdd: "+persona);
		return true;
	}
	
	public boolean actualizar(Persona persona){
		System.out.println("Actualizando persona en la bdd: "+persona);
		return true;
	}
	
	public boolean eliminar(Persona persona){
		System.out.println("Eliminando persona de la bdd: "+persona);
		return true;
	}
	
}
