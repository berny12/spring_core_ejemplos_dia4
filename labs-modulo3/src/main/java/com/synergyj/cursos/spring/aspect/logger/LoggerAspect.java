/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.aspect.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */

// TODO B) Anotar adicionalmente con @Aspect
@Aspect
@Component
public class LoggerAspect {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(LoggerAspect.class);

	/**
	 * Definición del pointcut.
	 */
	// TODO B) agregar una expresión que marque a todos los métodos del servicio
	// CalculadoraService
	@Pointcut("execution(* com.synergyj.cursos.spring.service.calculadora.CalculadoraService.*(..))")
	private void loggerPointcut() {
	}

	/**
	 * @param joinPoint
	 */
	// TODO C) Asociar a este advice el pointcut anterior empleando su firma, no
	// emplear su
	// expresión.
	@Before(" com.synergyj.cursos.spring.aspect.logger.LoggerAspect.loggerPointcut()")
	public void beforeAdvice(JoinPoint joinPoint) {

		logger.debug(" En beforeAdvice, argumentos:");
		for (Object obj : joinPoint.getArgs()) {
			logger.debug("argumento => {}", obj);
		}
		logger.debug("detalle del metodo a invocar: {}", joinPoint);
		logger.debug("invocando al metodo.");
	}

	/**
	 * @param valorRetorno
	 */

	// TODO D) Asociar a este advice el mismo pointcut, pero ahora empleando su
	// expresión.
	// TODO E) ¿Qué cambio se debe hacer para que se invoque este advice al
	// invocar le método
	// fechaActual del servicio CalculadoraService ?
	@AfterReturning(pointcut = "execution(* com.synergyj.cursos.spring.service.calculadora.CalculadoraService.*(..))", returning = "valorRetorno")
	public void afterReturningAdvice(Object valorRetorno) {
		logger.debug("En afterReturningAdvice ");
		logger.debug("imprimiendo el valor de retorno {}", valorRetorno);

	}

	/**
	 * @param ex
	 */
	@AfterThrowing(pointcut = "com.synergyj.cursos.spring.aspect.logger.LoggerAspect.loggerPointcut()", throwing = "ex")
	public void afterThrowingAdvice(UnsupportedOperationException ex) {
		logger.debug("En afterThrowingAdvice");
		logger.error("excepcion lanzada: {}", ex.toString());
	}

	/**
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around(value = "com.synergyj.cursos.spring.aspect.logger.LoggerAspect.loggerPointcut()")
	public Object roundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		Object returnValue;
		logger.debug("En around advice");
		logger.debug(" Antes de ejecutar el método, argumentos:");
		for (Object obj : pjp.getArgs()) {
			logger.debug("argumento => {}", obj);
		}
		logger.debug("invocando metodo ");
		returnValue = pjp.proceed(pjp.getArgs());
		logger.debug("despues de invocar, resultado: {}", returnValue);
		return returnValue;
	}
}
