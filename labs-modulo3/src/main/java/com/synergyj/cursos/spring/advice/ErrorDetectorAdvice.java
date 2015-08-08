/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de prop�sito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

/**
 * Como se puede observar, la interface no declara m�todos, sin embargo, se deben crear m�todos con
 * las siguiente convenci�n:
 * <code>void afterThrowing([Method, args, target], ThrowableSubclass);</code> Ejemplos:
 * 
 * <pre>
 * public void afterThrowing(Exception ex)
 * public void afterThrowing(RemoteException)
 * public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
 * public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)
 * </pre>
 * 
 * Spring invoca a estos m�todos empleando reflexi�n. Esto hace que la implementaci�n de un
 * ThrowsAdvice sea mas simple.
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 */
public class ErrorDetectorAdvice implements ThrowsAdvice {

	// TODO F) Implementar los m�todos que permitan cachar los errores de la clase
	// ClienteMalProgramadoService

	/*Crear un m�todo para manejar excepciones genericas con el siguiente c�digo.:
	 
	
	logger.error("Captura generica de excepciones.");
	logger.error("Excepcion cachada: {} ", ex.getClass().getName());
	logger.error("Argumentos del metodo {} que gener� el error : ", method.getName());
	for (int i = 0; i < args.length; i++) {
		logger.error("Arg {}: {}", i, args[i]);
	}
	logger.error("Mensaje del error:", ex);
	  
	*/
	
	/* Crear un m�todo para manejar SQLException con el siguiente codigo:
	 	logger.error("Captura de SqlException .");
		logger.error("Excepcion cachada: {} ", ex.getClass().getName());
		logger.error("Argumentos del metodo {} que gener� el error : ", method.getName());
		for (int i = 0; i < args.length; i++) {
			logger.error("Arg {}: {}", i, args[i]);
		}
		logger.error("Detalle del error:", ex);
	 
	 */
	
	
	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(ErrorDetectorAdvice.class);
}
