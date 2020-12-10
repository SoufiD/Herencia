package com.clearminds.sdi.persona;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {
	public static void main(String[] args) {
		PersonaManager p = new PersonaManager();
		p.insertarPersona(new Persona("1234567890","Sofia Díaz",26));
	}
}
