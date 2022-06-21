package com.uce.prueba1.repository;

import org.springframework.stereotype.Repository;

import com.uce.prueba1.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	
	
	@Override
	public void nuveoPropietario(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se agrego un nuevo Propietario...");
		
	}

	@Override
	public void buscarPropietario(String idPropietario) {
		// TODO Auto-generated method stub
		System.out.println("Se encontro un Propietario de: "+ idPropietario);

	}

	@Override
	public void actualizarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se agrego un nuevo Vehiculo...");

	}

	@Override
	public void eliminarPropietario(String idPropietario) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el Propietario: "+idPropietario);
	}

}
