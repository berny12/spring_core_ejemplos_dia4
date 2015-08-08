/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.spring.beans.Cliente;
import com.synergyj.cursos.spring.dao.ClienteDAO;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
public class ClienteMalProgramadoService {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(ClienteMalProgramadoService.class);

	private ClienteDAO clienteDAO;

	public void creaCliente(Cliente c) {
		try {
			clienteDAO.crea(c);
		} catch (Exception e) {
			// uhh , mal, al programador se le olvida manejar el error
		}
		logger.debug("cliente creado con exito, continuando con el registro de su tarjeta");
		try {
			clienteDAO.creaTarjeta(c.getId());
		} catch (Exception e) {
			// uhh , y otra vez la burra al trigo, que despidan a este cuate!
		}
		logger.debug("tarjeta actualizada con exito!");
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

}
