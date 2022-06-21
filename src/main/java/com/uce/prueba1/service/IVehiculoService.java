package com.uce.prueba1.service;

import com.uce.prueba1.modelo.Vehiculo;

public interface IVehiculoService {

	public void nuveoVehiculo(Vehiculo v);
	public void buscarVehiculo(String placa);
	public void actualizarVehiculo (Vehiculo v);
	public void eliminarVehiculo(String placa);
	
	
}
