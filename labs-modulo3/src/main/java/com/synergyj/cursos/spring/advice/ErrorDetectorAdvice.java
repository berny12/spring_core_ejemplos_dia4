/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

/**
 * Como se puede observar, la interface no declara métodos, sin embargo, se deben crear métodos con
 * las siguiente convención:
 * <code>void afterThrowing([Method, args, target], ThrowableSubclass);</code> Ejemplos:
 * 
 * <pre>
 * public void afterThrowing(Exception ex)
 * public void afterThrowing(RemoteException)
 * public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
 * public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)
 * </pre>
 * 
 * Spring invoca a estos métodos empleando reflexión. Esto hace que la implementación de un
 * ThrowsAdvice sea mas simple.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class ErrorDetectorAdvice implements ThrowsAdvice {

	// TODO F) Implementar los métodos que permitan cachar los errores de la clase
	// ClienteMalProgramadoService

	/*Crear un método para manejar excepciones genericas con el siguiente código.:
	 
	
	logger.error("Captura generica de excepciones.");
	logger.error("Excepcion cachada: {} ", ex.getClass().getName());
	logger.error("Argumentos del metodo {} que generó el error : ", method.getName());
	for (int i = 0; i < args.length; i++) {
		logger.error("Arg {}: {}", i, args[i]);
	}
	logger.error("Mensaje del error:", ex);
	  
	*/
	
	/* Crear un método para manejar SQLException con el siguiente codigo:
	 	logger.error("Captura de SqlException .");
		logger.error("Excepcion cachada: {} ", ex.getClass().getName());
		logger.error("Argumentos del metodo {} que generó el error : ", method.getName());
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
