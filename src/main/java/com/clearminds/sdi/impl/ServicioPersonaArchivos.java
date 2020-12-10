package com.clearminds.sdi.impl;

import com.clearminds.sdi.interfaces.ServicioPersona;
import com.clearminds.sdi.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona{
	
	public boolean insertar(Persona persona){
		System.out.println("Insertando persona en un archivo: "+persona);
		return true;
	}
	
	public boolean actualizar(Persona persona){
		System.out.println("Actualizando persona en un archivo: "+persona);
		return true;
	}
	
	public boolean eliminar(Persona persona){
		System.out.println("Eliminando persona de un archivo: "+persona);
		return true;
	}
	
}
