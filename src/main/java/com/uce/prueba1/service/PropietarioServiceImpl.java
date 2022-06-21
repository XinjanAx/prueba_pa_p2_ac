package com.uce.prueba1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.prueba1.modelo.Propietario;
import com.uce.prueba1.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository propRepository;
	
	@Override
	public void nuveoPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.propRepository.nuveoPropietario(p);
	}

	@Override
	public void buscarPropietario(String idPropietario) {
		// TODO Auto-generated method stub
		this.propRepository.buscarPropietario(idPropietario);
	}

	@Override
	public void actualizarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.propRepository.actualizarPropietario(p);
	}

	@Override
	public void eliminarPropietario(String idPropietario) {
		// TODO Auto-generated method stub
		this.propRepository.eliminarPropietario(idPropietario);
	}

}
