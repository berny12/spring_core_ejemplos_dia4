package com.synergyj.cursos.spring.pruebas;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.ProxyFactory;

import com.synergyj.cursos.spring.service.SaludaService;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class HolaMundoConAopTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(HolaMundoConAopTestCase.class);

	@Test
	public void holaMundoAOP() {
		ProxyFactory pf = null;
		SaludaService target;
		SaludaService proxy;
		String saludo;

		target = new SaludaService();

		// Creamos la factoria de proxies
		// TODO A) crear y configurar la variable pf

		// observar la obtención del proxy
		proxy = (SaludaService) pf.getProxy();

		// Saludamos sin AOP, el saludo queda feo.
		saludo = target.getSaludo("SynergyJ");
		logger.debug(saludo);
		// TODO B) Escribir un assert para verificar el saludo sin decoración
		Assert.assertEquals("Hola SynergyJ", saludo);

		// Saludamos con AOP, el saludo queda bien porque se "decoro" el mensaje.
		saludo = proxy.getSaludo("SynergyJ con AOP");
		logger.debug(saludo);
		// TODO C) Escribir un assert para verificar el saludo pero ahora decorado.

	}

}
