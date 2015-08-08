package com.synergyj.cursos.spring.pruebas;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

import com.synergyj.cursos.spring.beans.Cliente;
import com.synergyj.cursos.spring.dao.ClienteDAO;
import com.synergyj.cursos.spring.service.ClienteMalProgramadoService;

/**
 * Este TestCase muestra el uso de un {@link ThrowsAdvice}. Se ilustra como se pueden mandar a
 * bitacotas las excepciones que no fueron manejadas adecuadamente.
 */
public class ThrowsAdviceTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(ThrowsAdviceTestCase.class);

	private ClienteMalProgramadoService service = new ClienteMalProgramadoService();

	@Test
	public void detectaErrores() {

		// TODO D) Sin hacer cambio aun, correr la prueba, observar que es exitosa, aparentemente no
		// hay errores ya que estos se estan ocultando por una mala programación
		// revisar ClienteMalProgramadoService y ClienteDAO.

		ClienteDAO dao;

		logger.debug("iniciando prueba");
		dao = new ClienteDAO();

		// TODO E) implementar el método getProxy para imprimir los errores en consola y sustituir
		// el DAO real por un proxy empleando la siguiiente instrucción:
		// service.setClienteDAO(getProxy(dao));
		service.setClienteDAO(dao);

		service.creaCliente(new Cliente());

	}

	/**
	 * @param dao
	 * @return
	 */
	private ClienteDAO getProxy(ClienteDAO dao) {
		// TODO implementar
		return null;
	}

}
