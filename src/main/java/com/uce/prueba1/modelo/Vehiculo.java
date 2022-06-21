package com.uce.prueba1.modelo;

import java.math.BigDecimal;

public class Vehiculo {
	
	private String marca,modelo,placa,tipo;
	private BigDecimal precio;
		
	@Override
	public String toString() {
		return "Vehiculo marca " + marca + ", modelo " + modelo + ", placa " + placa + ", " + tipo + ", $"
				+ precio;
	}
	//get set
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public String getTipo() {
		return tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	
}
