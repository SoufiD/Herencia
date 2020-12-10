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
	
	
	
	public PersonaManager() throws InstanceException{
		Class<?> clase;
		Properties p = new Properties();
		
		try {

			p.load(new FileReader("clases.properties"));
			clase = Class.forName(p.getProperty("clase"));
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener el archivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener el archivo");
		}

	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
}
