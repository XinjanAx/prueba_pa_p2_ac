package com.uce.prueba1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.prueba1.modelo.Matricula;
import com.uce.prueba1.repository.IMatriculaRepository;



@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Override
	public void crearMatricula(String idPropietario,String placa) {
		// TODO Auto-generated method stub
		
		
		this.matriculaRepository.crearMatricula(idPropietario, placa);
		
		
	}

	@Override
	public void buscarMatricula(String idPropietario) {
		// TODO Auto-generated method stub
		this.matriculaRepository.buscarMatricula(idPropietario);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizarMatricula(m);
	}

	@Override
	public void eliminarMatricula(String idPropietario) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminarMatricula(idPropietario);
	}

}
