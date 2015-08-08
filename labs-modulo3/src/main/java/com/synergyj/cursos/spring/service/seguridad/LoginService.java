package com.synergyj.cursos.spring.service.seguridad;


/**
 * Clase empleada para simular un servcio de seguridad empleando un {@link ThreadLocal}
 */
public class LoginService {

	private static ThreadLocal<Usuario> threadLocal = new ThreadLocal<Usuario>();

	public void login(String usuario, String password) {
		threadLocal.set(new Usuario(usuario, password));
	}

	public void logout() {
		threadLocal.set(null);
	}

	public Usuario getUsuarioFirmado() {
		return threadLocal.get();
	}

}
