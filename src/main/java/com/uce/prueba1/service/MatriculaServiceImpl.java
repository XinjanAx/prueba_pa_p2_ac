package com.uce.prueba1.service;

import java.math.BigDecimal;

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
		
		Matricula mSupp = this.matriculaRepository.buscarMatricula(idPropietario,placa);
	
		if (mSupp.getVeiculo().getTipo()=="pesado") {
		
		mSupp.setValorMatricula(mSupp.getVeiculo().getPrecio().multiply(new BigDecimal(14).divide(new BigDecimal(100))));
			
		}else if(mSupp.getVeiculo().getTipo()=="ligero") {
			
			mSupp.setValorMatricula(mSupp.getVeiculo().getPrecio().multiply(new BigDecimal(12).divide(new BigDecimal(100))));
		}
		if (mSupp.getValorMatricula().intValue()>=2000){
			mSupp.setValorMatricula(mSupp.getValorMatricula().multiply(new BigDecimal(7).divide(new BigDecimal(100))));
		}
		
		if (mSupp.getValorMatricula().compareTo(new BigDecimal(2000)) > 0) {
            BigDecimal descuento = mSupp.getValorMatricula().multiply(new BigDecimal(7)).divide(new BigDecimal(100));
            mSupp.setValorMatricula(mSupp.getValorMatricula().subtract(descuento));
            System.out.println("---------\nSi aplica el descuento\n---------");
		}
		
		
		System.out.println("Se genero la Matricula:" + mSupp);
	}

	@Override
	public Matricula buscarMatricula(String idPropietario,String placa) {
		return this.matriculaRepository.buscarMatricula(idPropietario,placa);
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
