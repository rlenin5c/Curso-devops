package io.carlosaltamirano.facturacion.core.service;

import io.carlosaltamirano.facturacion.core.exception.FacturacionWebException;
import io.carlosaltamirano.facturacion.core.model.Empresa;

public interface EmpresaService {

	
	Empresa crear(Empresa empresa) throws FacturacionWebException;
	
	void eliminar(Empresa empresa) throws FacturacionWebException;
	
}
