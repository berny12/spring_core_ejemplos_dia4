/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.dao;

import java.sql.SQLException;

import com.synergyj.cursos.spring.beans.Cliente;

/**
 * Simula a un DAO para generar errores.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class ClienteDAO {

	public void crea(Cliente c) {
		throw new UnsupportedOperationException("Aun no desarrollo este método");
	}

	public void creaTarjeta(Long id) throws SQLException {
		throw new SQLException("No hay conexion a la BD");
	}
}