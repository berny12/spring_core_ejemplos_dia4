/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.advice;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class ValidadorSpringAOPBeforeAdvice implements MethodBeforeAdvice {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ValidadorSpringAOPBeforeAdvice.class);

	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method,
	 * java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		logger.debug("Estoy en BeforeAdvice...");

		logger.debug("Iterando argumentos: " + args.length);
		for (int i = 0; i < args.length; i++) {
			Object o = args[i];
			if (o == null) {
				throw new IllegalArgumentException("no se admiten nulos.");
			}
		}

	}

}
