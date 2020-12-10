package com.clearminds.sdi.interfaces;

import com.clearminds.sdi.model.Persona;

public interface ServicioPersona {
	
	public boolean insertar(Persona persona);
	public boolean actualizar(Persona persona);
	public boolean eliminar(Persona persona);
}
