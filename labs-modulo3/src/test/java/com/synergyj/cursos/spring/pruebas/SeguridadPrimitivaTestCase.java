package com.synergyj.cursos.spring.pruebas;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.ProxyFactory;

import com.synergyj.cursos.spring.advice.SeguridadAdvice;
import com.synergyj.cursos.spring.service.seguridad.ServicioSeguro;

public class SeguridadPrimitivaTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(SeguridadPrimitivaTestCase.class);

	@Test
	public void sinSeguridad() {
		// Observar que no hay seguridad aquí, metodoSeguro se invoca sin nunguna autenticación
		ServicioSeguro servicioSeguro = new ServicioSeguro();
		servicioSeguro.metodoSeguro();
	}

	// TODO A) En este caso observar como se puede volver seguro a un método sin alterar una sóla
	// línea de código en la clase ServicioSeguro. Revusar el método getServicioSeguro. Ahora el
	// test case debe esperar una excepcion para que sea exitosa. Revisar SeguridadAdvice y
	// completar el tag @Test.
	@Test
	public void conSeguridadSinLogin() {
		ServicioSeguro servicioSeguro = getServicioSeguro();
		servicioSeguro.metodoSeguro();
	}

	@Test
	public void conSeguridadConUsuarioInvalido() {

		// TODO B) Hacer login para intentar ejecutar metodoSegurto, pero proporcionar un usuario y
		// password inexistente. Completar @Test para que sea exitosa.

		ServicioSeguro servicioSeguro = getServicioSeguro();
		servicioSeguro.metodoSeguro();
	}

	@Test
	public void conSeguridadUsuarioValido() {
		// TODO C) Mismo caso pero ahora indicar usuario y password validos

		ServicioSeguro servicioSeguro = getServicioSeguro();
		servicioSeguro.metodoSeguro();
	}

	/**
	 * APlicando seguridad a una clase a través de AOP.
	 * @return
	 */
	private static ServicioSeguro getServicioSeguro() {
		ServicioSeguro service = new ServicioSeguro();

		SeguridadAdvice advice = new SeguridadAdvice();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(advice);
		pf.setTarget(service);

		ServicioSeguro proxy = (ServicioSeguro) pf.getProxy();

		return proxy;
	}

}
