package com.synergyj.cursos.spring.pruebas;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.synergyj.cursos.spring.service.calculadora.CalculadoraService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/aopAnotacionesAppContext.xml")
public class AopAnotacionesTestCase {

	@Resource
	private CalculadoraService calculadora;

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(AopAnotacionesTestCase.class);

	@Test
	public void calculadora() {
		assertNotNull(calculadora);
		logger.debug("invocando operaciones de la calculadora");
		logger.debug("1. invocando suma");
		calculadora.suma(1, 2);
		logger.debug("2. invocando fechaActual");
		calculadora.fechaActual("dd-mm-yyyy");
		try {
			logger.debug("3. invocando raiz");
			calculadora.raiz(4);
		} catch (UnsupportedOperationException e) {
			// no se maneja para apreciar el error via AOP.
		}
	}
}
