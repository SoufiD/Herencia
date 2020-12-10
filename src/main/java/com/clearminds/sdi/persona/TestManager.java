package com.clearminds.sdi.persona;

import com.clearminds.sdi.excepciones.InstanceException;
import com.clearminds.sdi.impl.PersonaManager;
import com.clearminds.sdi.model.Persona;

public class TestManager {
	public static void main(String[] args) {
		PersonaManager p;
		try {
			p = new PersonaManager();
			p.insertarPersona(new Persona("1234567890","Sofia Díaz",26));
		} catch (InstanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
