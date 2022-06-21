package com.uce.prueba1.repository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.prueba1.modelo.Matricula;
import com.uce.prueba1.modelo.Propietario;
import com.uce.prueba1.modelo.Vehiculo;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{
	
	@Autowired
	private Propietario p;
	@Autowired
	private Vehiculo v;
	
	@Override
	public void crearMatricula(String idPropietario,String placa) {
		p = new Propietario();
		p.setId(idPropietario);
		p.setNombre("Mike");
		p.setApellido("Wasausky");
		
		v = new Vehiculo();
		v.setMarca("Mazda");
		v.setModelo("m3");
		v.setPlaca(placa);
		v.setPrecio(new BigDecimal(22000));
		
	} 

	@Override
	public void buscarMatricula(String idPropietario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarMatricula(String idPropietario) {
		// TODO Auto-generated method stub
		
	}

}
