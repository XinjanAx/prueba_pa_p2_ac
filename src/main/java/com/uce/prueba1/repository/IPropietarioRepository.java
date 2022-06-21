package com.uce.prueba1.repository;

import com.uce.prueba1.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void nuveoPropietario(Propietario p);
	public void buscarPropietario(String idPropietario);
	public void actualizarPropietario (Propietario p);
	public void eliminarPropietario(String idPropietario);
	

}
