/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.pruebas;

import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import com.synergyj.cursos.spring.service.SaludaService;

public class BeforeAdviceTestCase implements MethodBeforeAdvice {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(BeforeAdviceTestCase.class);

	/**
	 * Muestra el uso de un {@link MethodBeforeAdvice} implementado por esta
	 * misma clase.
	 */
	@Test
	public void beforeAdvice() {
		SaludaService target;
		String saludo;
		ProxyFactory pf;
		SaludaService proxy = null;

		target = new SaludaService();
		pf = new ProxyFactory();
		pf.addAdvice(new BeforeAdviceTestCase());
		pf.setTarget(target);

		// TODO A) inicializar la variable proxy
		proxy = (SaludaService) pf.getProxy();

		saludo = proxy.getSaludo("SynergyJ");

		// TODO B) Completar el assert que valide el valor de la variable
		// saludo. ¿ Por qué es
		// totalmente diferente al valor del argumento ?
		Assert.assertEquals("Hola Otra empresa", saludo);
		logger.debug("{}", saludo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method
	 * , java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {

		logger.debug("Antes de invocar, #Parametros: {}", args.length);
		Assert.assertEquals(1, args.length);
		logger.debug("Alterando los parametros, advice malicioso ...");
		args[0] = "Otra empresa";

		logger.debug("Inspeccion terminada, invocando al metodo..");
	}

}
