package org.openxava.escuela;

import javax.persistence.*;

import org.openxava.IEscuela.*;
import org.openxava.annotations.*;

@Entity
public class Escuela implements IEscuela{

	@Id @Required @Column(length=5)
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String nombre() {
		return nombre();
	}

	@Override
	public String numeroDocumento() {
		return numeroDocumento();
	}

}
