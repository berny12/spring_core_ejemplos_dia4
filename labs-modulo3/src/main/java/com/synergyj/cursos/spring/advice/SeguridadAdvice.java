package com.synergyj.cursos.spring.advice;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import com.synergyj.cursos.spring.service.seguridad.LoginService;
import com.synergyj.cursos.spring.service.seguridad.Usuario;

/**
 * Implementación simple de un sistema de seguridad an intentar invocar un método.
 */
public class SeguridadAdvice implements MethodBeforeAdvice {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(SeguridadAdvice.class);

	private LoginService seguridadService = new LoginService();

	private String usuarioUnico = "admin";

	private String password = "password";

	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method,
	 * java.lang.Object[], java.lang.Object)
	 */
	public void before(Method method, Object[] args, Object target) throws Throwable {
		Usuario usuario = seguridadService.getUsuarioFirmado();

		if (usuario == null) {
			logger.warn("=> no se esta firmado en el sistema de seguridad");
			throw new SecurityException("Se debe firmar antes de intentar ejecutar el servicio.");
		} else if (usuarioUnico.equals(usuario.getNombre())
				&& password.equals(usuario.getPassword())) {
			logger.info("=> Permiso concedido");
		} else {
			throw new SecurityException("=> Usuario invalido en el sistema.");
		}
	}

}
