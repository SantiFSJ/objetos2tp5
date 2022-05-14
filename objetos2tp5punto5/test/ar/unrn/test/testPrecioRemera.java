package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.tp5.modelo.RemeraImportada;
import ar.unrn.tp5.modelo.RemeraNacional;

public class testPrecioRemera {
	@Test
	public void calcularPrecioRemeraNacional() {
		// Set up
		RemeraNacional remera = new RemeraNacional(1000.0);

		// Ejercitación
		double rtadoObtenido = remera.obtenerPrecioFinal();

		// Verificacion
		double rtadoEsperado = 965.0;

		assertEquals(rtadoEsperado, rtadoObtenido);

	}

	@Test
	public void calcularPrecioRemeraImportada() {
		// Set up
		RemeraImportada remera = new RemeraImportada(1000.0);

		// Ejercitación
		double rtadoObtenido = remera.obtenerPrecioFinal();

		// Verificacion
		double rtadoEsperado = 1330.0;

		assertEquals(rtadoEsperado, rtadoObtenido);

	}
}
