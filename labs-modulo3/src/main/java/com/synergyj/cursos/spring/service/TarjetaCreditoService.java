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
public interface TarjetaCreditoService {

	void aplicaCargo(String numeroTarjeta, String vencimiento, String numSeguridad);
}
