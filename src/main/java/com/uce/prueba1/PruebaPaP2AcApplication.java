package com.uce.prueba1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.prueba1.modelo.Matricula;
import com.uce.prueba1.modelo.Propietario;
import com.uce.prueba1.modelo.Vehiculo;
import com.uce.prueba1.service.MatriculaServiceImpl;
import com.uce.prueba1.service.PropietarioServiceImpl;
import com.uce.prueba1.service.VehiculoServiceImpl;

@SpringBootApplication
public class PruebaPaP2AcApplication implements CommandLineRunner{

	@Autowired
	public VehiculoServiceImpl vehiculoS;
	@Autowired
	public PropietarioServiceImpl propietarioS;
	@Autowired
	public MatriculaServiceImpl MatriculaS;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2AcApplication.class, args);
	}

	public void run(String... args) throws Exception {
				
		Propietario p1 = new Propietario();
		p1.setId("1722341788");
		p1.setNombre("Mike");
		p1.setApellido("Wasausky");
		this.propietarioS.nuveoPropietario(p1);
		
		
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Mazda");
		v1.setModelo("m3");
		v1.setPlaca("PER-8552");
		v1.setPrecio(new BigDecimal(2200000));
		v1.setTipo("ligero");
		this.vehiculoS.nuveoVehiculo(v1);
		
		
		this.MatriculaS.crearMatricula(p1.getId(), v1.getPlaca());
		
		
		
	}
	
	
}
