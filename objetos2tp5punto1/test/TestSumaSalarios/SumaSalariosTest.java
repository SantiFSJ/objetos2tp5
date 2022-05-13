package TestSumaSalarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unrn.objetos2tp5.modelo.EmpleadoConGenteACargo;
import ar.unrn.objetos2tp5.modelo.EmpleadoRegular;

public class SumaSalariosTest {
	@Test
	public void sumaDeSalariosNormal() {
		// Set up
		EmpleadoRegular r1 = new EmpleadoRegular(2500.0);
		EmpleadoRegular r2 = new EmpleadoRegular(2500.0);
		EmpleadoRegular r3 = new EmpleadoRegular(2500.0);
		EmpleadoRegular r4 = new EmpleadoRegular(2500.0);
		EmpleadoRegular r5 = new EmpleadoRegular(2500.0);
		EmpleadoRegular r6 = new EmpleadoRegular(2500.0);
		EmpleadoRegular r7 = new EmpleadoRegular(2500.0);
		EmpleadoRegular r8 = new EmpleadoRegular(2500.0);

		EmpleadoConGenteACargo l1 = new EmpleadoConGenteACargo(3500.0, List.of(r1, r2));
		EmpleadoConGenteACargo l2 = new EmpleadoConGenteACargo(3500.0, List.of(r3, r4));
		EmpleadoConGenteACargo l3 = new EmpleadoConGenteACargo(3500.0, List.of(r5, r6));
		EmpleadoConGenteACargo l4 = new EmpleadoConGenteACargo(3500.0, List.of(r7, r8));

		EmpleadoConGenteACargo m1 = new EmpleadoConGenteACargo(5000.0, List.of(l1, l2));
		EmpleadoConGenteACargo m2 = new EmpleadoConGenteACargo(5000.0, List.of(l3, l4));

		EmpleadoConGenteACargo g1 = new EmpleadoConGenteACargo(7500.0, List.of(m1));
		EmpleadoConGenteACargo g2 = new EmpleadoConGenteACargo(7500.0, List.of(m2));

		EmpleadoConGenteACargo d1 = new EmpleadoConGenteACargo(10000.0, List.of(g1, g2));

		// Ejercitación
		Double totalSalarios = d1.calcularSalario();

		// Verificacion

		Double rtadoEsperado = 69000.0;

		assertEquals(rtadoEsperado, totalSalarios);

	}
}
