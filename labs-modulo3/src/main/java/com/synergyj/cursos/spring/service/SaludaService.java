/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.service;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class SaludaService {

	/**
	 * Este metodo construye una cadena para saludar.
	 * @param nombre
	 * @return
	 */
	public String getSaludo(String nombre) {
		return "Hola " + nombre;
	}
}
