/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de prop�sito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.service;

/**
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
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
