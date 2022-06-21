package com.uce.prueba1.repository;

import com.uce.prueba1.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void nuveoVehiculo(Vehiculo v);
	public void buscarVehiculo(String placa);
	public void actualizarVehiculo (Vehiculo v);
	public void eliminarVehiculo(String placa);

}
