package com.uce.prueba1.service;

import com.uce.prueba1.modelo.Propietario;

public interface IPropietarioService {
	
	public void nuveoPropietario(Propietario p);
	public void buscarPropietario(String idPropietario);
	public void actualizarPropietario (Propietario p);
	public void eliminarPropietario(String idPropietario);
}
