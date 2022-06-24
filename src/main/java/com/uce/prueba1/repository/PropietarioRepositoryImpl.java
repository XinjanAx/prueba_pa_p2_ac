package com.uce.prueba1.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.prueba1.modelo.Propietario;
import com.uce.prueba1.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	private Propietario p = new Propietario();
	
	@Override
	public void nuveoPropietario(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se agrego un nuevo " + p);
		this.p=p;
	}

	@Override
	public Propietario buscarPropietario(String idPropietario) {
		// TODO Auto-generated method stub
		System.out.println("Se encontro un Propietario de: "+ idPropietario);
		return this.p;
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
