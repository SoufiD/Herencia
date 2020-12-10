package com.clearminds.sdi.impl;

import com.clearminds.sdi.excepciones.InstanceException;
import com.clearminds.sdi.interfaces.ServicioPersona;
import com.clearminds.sdi.model.Persona;

public class PersonaManager {
	ServicioPersona serv;
	
	public PersonaManager() throws InstanceException{
		Class<?> clase;
		try {
			clase = Class.forName("com.clearminds.sdi.impl.ServicioPersonaBDD");
			serv=(ServicioPersona) clase.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}

	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
}
