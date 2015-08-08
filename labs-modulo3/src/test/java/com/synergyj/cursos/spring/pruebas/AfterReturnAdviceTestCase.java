package com.synergyj.cursos.spring.pruebas;

import java.lang.reflect.Method;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import com.synergyj.cursos.spring.service.SaludaService;

public class AfterReturnAdviceTestCase implements AfterReturningAdvice {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(AfterReturnAdviceTestCase.class);

	/**
	 * Muestra el uso de un {@link AfterReturningAdvice} implementado por esta misma clase.
	 */
	@Test
	public void afterReturn() {
		SaludaService saludaService;
		ProxyFactory pf;

		saludaService = new SaludaService();
		pf = new ProxyFactory();
		pf.addAdvice(new AfterReturnAdviceTestCase());
		pf.setTarget(saludaService);

		SaludaService proxy = (SaludaService) pf.getProxy();

		proxy.getSaludo("SynergyJ");
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
			throws Throwable {
		logger.debug("Despues del mŽetodo: {} ", method.getName());
		logger.debug("se obtuvo el siguiente resultado: {} ", returnValue);

		// TODO C) escribir un Assert que compruebe que el valor de la variable returnValue es igual
		// al invocar directamente al métrodo getSaludo empleando la variable target.

	}

}
