package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import ar.unrn.tp5.modelo.CalculadorJubilado;
import ar.unrn.tp5.modelo.CalculadorNoJubilado;

public class testCalculador {
	@Test
	public void calcularJubiladoEnMesDePromocion() {
		// Set up
		LocalDate fecha = LocalDate.now();
		CalculadorJubilado calculadorJubilado = new CalculadorJubilado(fecha.getMonthValue());

		// Ejercitación
		double rtadoObtenido = calculadorJubilado.calcularPrecio(300.0);

		// Verificacion
		double rtadoEsperado = 300.0;
		assertEquals(rtadoEsperado, rtadoObtenido);

	}

	@Test
	public void calcularJubiladoEnMesNormal() {
		// Set up
		LocalDate fecha = LocalDate.now();

		CalculadorJubilado calculadorJubilado = null;
		if (fecha.getMonthValue() + 2 > 12) {
			calculadorJubilado = new CalculadorJubilado(fecha.getMonthValue() - 2);
		} else {
			calculadorJubilado = new CalculadorJubilado(fecha.getMonthValue() + 2);
		}

		// Ejercitación
		double rtadoObtenido = calculadorJubilado.calcularPrecio(300.0);

		// Verificacion
		double rtadoEsperado = 330.0;
		assertEquals(rtadoEsperado, rtadoObtenido);

	}

	@Test
	public void calcularNoJubiladoEnMesDePromocion() {
		// Set up
		LocalDate fecha = LocalDate.now();
		CalculadorNoJubilado calculadorNoJubilado = new CalculadorNoJubilado(fecha.getMonthValue());

		// Ejercitación
		double rtadoObtenido = calculadorNoJubilado.calcularPrecio(300.0);

		// Verificacion
		double rtadoEsperado = 345.0;
		assertEquals(rtadoEsperado, rtadoObtenido);

	}

	@Test
	public void calcularNoJubiladoEnMesNormal() {
		// Set up
		LocalDate fecha = LocalDate.now();
		CalculadorNoJubilado calculadorNoJubilado = null;
		if (fecha.getMonthValue() + 2 > 12) {
			calculadorNoJubilado = new CalculadorNoJubilado(fecha.getMonthValue() - 2);
		} else {
			calculadorNoJubilado = new CalculadorNoJubilado(fecha.getMonthValue() + 2);
		}

		// Ejercitación
		double rtadoObtenido = calculadorNoJubilado.calcularPrecio(300.0);

		// Verificacion
		double rtadoEsperado = 363.0;
		assertEquals(rtadoEsperado, rtadoObtenido);

	}
}
