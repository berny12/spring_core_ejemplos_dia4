package com.synergyj.cursos.spring.beans;

public class Dependencia {
	private UnaDependencia unaDependencia;

	public void ejecutar() {
		unaDependencia.foo();
		unaDependencia.bar();
	}

	public void setUnaDependencia(UnaDependencia unaDependencia) {
		this.unaDependencia = unaDependencia;
	}

}
