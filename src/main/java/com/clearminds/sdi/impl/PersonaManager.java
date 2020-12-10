package com.clearminds.sdi.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.sdi.excepciones.InstanceException;
import com.clearminds.sdi.interfaces.ServicioPersona;
import com.clearminds.sdi.model.Persona;

public class PersonaManager {
	ServicioPersona serv;
	
	
	public String lecturaClase(){
		Properties p = new Properties();
		String s = null;
		try {
			p.load(new FileReader("clases.properties"));
			s= p.getProperty("clase");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	
	public PersonaManager() throws InstanceException{
		Class<?> clase;
		String cls=lecturaClase();
		
		try {
			clase = Class.forName(cls);
			serv=(ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} 

	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
}
