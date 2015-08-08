/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.spring.service.SaludaService;

/**
 * Este interceptor obtiene el saludo que genera {@link SaludaService} y lo mejora.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class SaludaServiceDecorator implements MethodInterceptor {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(SaludaServiceDecorator.class);

	public Object invoke(MethodInvocation invocation) throws Throwable {
		String metodo;
		String saludo;

		metodo = invocation.getMethod().getName();
		logger.debug("antes de invocar a {}", metodo);

		// Esta linea invoca el metodo del objeto target
		saludo = invocation.proceed().toString();
		saludo = "¡ " + saludo + " Bienvenido,  te va a gustar !!!";
		logger.debug("El saludo ha sido mejorado.");
		return saludo;
	}

}
