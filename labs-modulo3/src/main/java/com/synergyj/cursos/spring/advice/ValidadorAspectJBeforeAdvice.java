package com.synergyj.cursos.spring.advice;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Asoecti configurado Vía XML.
 */
public class ValidadorAspectJBeforeAdvice {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ValidadorAspectJBeforeAdvice.class);

	/**
	 * (non-Javadoc) Befor Advice empleado para validar que los parámetros no sean nulos.
	 */
	public void validaParametros(JoinPoint joinPoint) {
		logger.debug("Estoy en BeforeAdvice...");
		Object[] args = joinPoint.getArgs();
		logger.debug("Iterando argumentos: " + args.length);
		for (int i = 0; i < args.length; i++) {
			Object o = args[i];
			if (o == null) {
				throw new IllegalArgumentException("no se admiten nulos.");
			}
		}
	}

}
