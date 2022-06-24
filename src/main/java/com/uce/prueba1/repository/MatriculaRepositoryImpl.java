package com.uce.prueba1.repository;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.prueba1.modelo.Matricula;


@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{
	
	private Matricula m = new Matricula();
	@Autowired
	private IPropietarioRepository propRepository;
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	public void crearMatricula(String idPropietario,String placa) {
		
		m.setPropietario(this.propRepository.buscarPropietario(idPropietario));
		m.setVeiculo(this.vehiculoRepository.buscarVehiculo(placa));
		this.m.setFechaIngreso(LocalDateTime.now());
		
	} 

	@Override
	public Matricula buscarMatricula(String idPropietario,String placa) {
		System.out.println("Se encontro una Matricula de id: "+ idPropietario +", "+ placa);
		return m;	
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
