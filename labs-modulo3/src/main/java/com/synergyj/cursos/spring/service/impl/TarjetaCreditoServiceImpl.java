/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.spring.service.TarjetaCreditoService;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService {

	/**
	 * 
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(TarjetaCreditoServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.synergyj.cursos.spring.service.TarjetaCreditoService#aplicaCargo(
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void aplicaCargo(String numeroTarjeta, String vencimiento,
			String numSeguridad) {
		logger.debug("Aplicando un cargo a la tarjeta.");
		logger.debug("Los argumentos no deben ser nulos, se emplea un validador con AOP"
				+ " para asegurar que no lleguen nulos.");
		logger.debug("tarjeta no nula: {}", numeroTarjeta.trim());
		logger.debug("vencimiento no nulo: {}", vencimiento.trim());
		logger.debug("numSeguridad nu nulo: {}", numSeguridad.trim());
	}

}
