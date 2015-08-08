/**
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es de propósito educativo, puede ser
 * empleado para fines sin lucro haciendo referencia 
 * al autor intelectual.
 */
package com.synergyj.cursos.spring.service.calculadora;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Esta clase simula un servicio de negocio, se desea monitoreas los valores de los parámetros y de
 * los valores de retorno a través del uso de un aspecto. Lo importante en estos métodos no es lo
 * que hacen sino lo que reciben y el valor de retorno.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 */
@Service("calculadoraService")
public class CalculadoraService {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(CalculadoraService.class);

	/**
	 * @param op1
	 * @param op2
	 * @return
	 */
	public Double suma(double op1, double op2) {

		logger.debug("en suma");
		return op1 + op2;
	}

	/**
	 * @param p1
	 * @return
	 */
	public String fechaActual(String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		logger.debug("en fechaActual");
		return sdf.format(new Date());
	}

	/**
	 * @param p1
	 * @param p2
	 * @return
	 */
	public Double promedio(double... array) {
		double suma = 0;
		logger.debug("en promedio");
		for (double d : array) {
			suma += d;
		}
		return suma / array.length;
	}

	/**
	 * @param valor
	 * @return
	 */
	public Double raiz(double valor) {
		throw new UnsupportedOperationException("Operacion no disponible");
	}

}
