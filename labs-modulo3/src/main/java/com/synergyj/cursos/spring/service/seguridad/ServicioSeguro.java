package com.synergyj.cursos.spring.service.seguridad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Los metodos de esta clase se deben invocar bajo un entorno seguro, sin acceso libre.
 */
public class ServicioSeguro {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(ServicioSeguro.class);

	public void metodoSeguro() {
		logger.debug("Este mŽétodo esta ejecutandose en un entorno seguro.");
	}
}
