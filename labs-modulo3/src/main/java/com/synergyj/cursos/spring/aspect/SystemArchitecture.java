/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de prop�sito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Esta clase es un ejemplo de una definici�n de varios pointcuts.
 */

@Aspect
public class SystemArchitecture {

	/*
	 * A join point is in the web layer if the method is defined in a type in
	 * the com.xyz.someapp.web package or any sub-package under that.
	 */
	@Pointcut("within(com.xyz.someapp.web..)")
	public void inWebLayer() {
	}

	/*
	 * A join point is in the service layer if the method is defined in a type
	 * in the com.xyz.someapp.service package or any sub-package under that.
	 */
	@Pointcut("within(com.xyz.someapp.service..)")
	public void inServiceLayer() {
	}

	/*
	 * A join point is in the data access layer if the method is defined in a
	 * type in the com.xyz.someapp.dao package or any sub-package under that.
	 */
	@Pointcut("within(com.xyz.someapp.dao..)")
	public void inDataAccessLayer() {
	}

	/*
	 * A business service is the execution of any method defined on a service
	 * interface. This definition assumes that interfaces are placed in the
	 * "service" package, and that implementation types are in sub-packages. If
	 * you group service interfaces by functional area (for example, in packages
	 * com.xyz.someapp.abc.service and com.xyz.someapp.def.service) then the
	 * pointcut expression "execution(* com.xyz.someapp..service..(..))" could
	 * be used instead. Alternatively, you can write the expression using the
	 * bean PCD, like so "bean(Service)". (This assumes that you have named your
	 * Spring service beans in a consistent fashion.)
	 */
	@Pointcut("execution( com.xyz.someapp..service..(..))")
	public void businessService() {
	}

	/*
	 * A data access operation is the execution of any method defined on a dao
	 * interface. This definition assumes that interfaces are placed in the
	 * "dao" package, and that implementation types are in sub-packages.
	 */
	@Pointcut("execution( com.xyz.someapp.dao..(..))")
	public void dataAccessOperation() {
	}

}
