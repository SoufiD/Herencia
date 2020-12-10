package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	ServicioPersona serv;
	
	public PersonaManager(){
		serv=new ServicioersonaArchivos() {
		};
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
}
