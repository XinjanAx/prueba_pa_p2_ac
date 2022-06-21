package com.uce.prueba1.modelo;

public class Propietario {
	private String id,nombre,apellido;
	
	@Override
	public String toString() {
		return "Propietario: id " + id + ", " + nombre + " " + apellido;
	}

	//get set
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
