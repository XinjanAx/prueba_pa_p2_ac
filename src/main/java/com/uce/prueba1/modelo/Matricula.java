package com.uce.prueba1.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	
	private LocalDateTime fechaIngreso;
	private BigDecimal valorMatricula;
	//
	private Propietario propietario;
	private Vehiculo veiculo;
	
	
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Vehiculo veiculo) {
		this.veiculo = veiculo;
	}

}
