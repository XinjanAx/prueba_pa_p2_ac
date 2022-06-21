package com.uce.prueba1.repository;

import org.springframework.stereotype.Repository;

import com.uce.prueba1.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void nuveoVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se agrego un nuevo Vehiculo...");
	}

	@Override
	public void buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se encontro el Vehiculo: "+ placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiso un nuevo Vehiculo...");
	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se agrego un nuevo Vehiculo...");
	}

}
