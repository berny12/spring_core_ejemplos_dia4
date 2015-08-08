/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.pruebas;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.service.TarjetaCreditoService;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
@RunWith(SpringJUnit4ClassRunner.class)
// Probar con aopXmlSinNamespace.xml y después con aopXmlConNamespace.xml, revisar archivos.
// @ContextConfiguration("/aopXmlSinNamespace.xml")
// @ContextConfiguration("/aopXmlConNamespace.xml")
public class AopXMLTestCase {

	@Resource
	TarjetaCreditoService tarjetaCreditoService;

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(AopXMLTestCase.class);

	@Test(expected = IllegalArgumentException.class)
	public void aplicaCargoConNulls() {
		logger.debug("aplicando cargos con datos nulos  a una tarjeta");
		tarjetaCreditoService.aplicaCargo(null, "0120", "789");
	}

	@Test
	public void aplicaCargoSinNulos() {
		logger.debug("aplicando cargos sin datos nulos  a una tarjeta");
		tarjetaCreditoService.aplicaCargo("99999999999999", "0120", "789");
	}

}
