package com.uce.prueba1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.prueba1.modelo.Vehiculo;
import com.uce.prueba1.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	public void nuveoVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.nuveoVehiculo(v);
	}

	@Override
	public void buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.buscarVehiculo(placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizarVehiculo(v);
	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminarVehiculo(placa);
	}

}
