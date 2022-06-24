package com.uce.prueba1.service;

import com.uce.prueba1.modelo.Matricula;
import com.uce.prueba1.modelo.Propietario;
import com.uce.prueba1.modelo.Vehiculo;

public interface IMatriculaService {
	
	public void crearMatricula(String idPropietario,String placa);
	public Matricula buscarMatricula(String idPropietario,String placa);
	public void actualizarMatricula (Matricula m);
	public void eliminarMatricula(String idPropietario);

}
