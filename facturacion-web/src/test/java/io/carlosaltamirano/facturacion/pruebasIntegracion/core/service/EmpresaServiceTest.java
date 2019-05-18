package io.carlosaltamirano.facturacion.pruebasIntegracion.core.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.carlosaltamirano.facturacion.core.exception.FacturacionWebException;
import io.carlosaltamirano.facturacion.core.model.Empresa;
import io.carlosaltamirano.facturacion.core.service.EmpresaService;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//TODO: Completar
public class EmpresaServiceTest {

	@Autowired
	EmpresaService empresaService;
	
	private Empresa empresa;
	
	@Before
	public void setUp() {
		empresa = new Empresa("22552255123", "MI EMPRESA S.A.C");
	}
	
	@After
	public void destroy() {
		
		try {
			
			empresaService.eliminar(empresa);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void a_creacionEmpresaConDatosValidos() {
		
		try {
			
			empresa = empresaService.crear(empresa);
			
			//TODO: Completar código aquí
			
		} catch (FacturacionWebException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@Test
	public void b_creacionEmpresaCuandoRucExiste() {
		
		//TODO: Completar código aquí
			
		
	}
	
	
}
