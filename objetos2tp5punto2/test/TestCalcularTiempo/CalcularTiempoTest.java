package TestCalcularTiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unrn.tp5.modelo.Historia;
import ar.unrn.tp5.modelo.Proyecto;
import ar.unrn.tp5.modelo.Spike;
import ar.unrn.tp5.modelo.Tarea;

public class CalcularTiempoTest {
	@Test
	public void sumaDeSalariosNormal() {
		// Set up
		Tarea t1 = new Tarea(2);
		Tarea t2 = new Tarea(3);
		Tarea t3 = new Tarea(4);
		Tarea t4 = new Tarea(5);

		Tarea t5 = new Tarea(2);
		Tarea t6 = new Tarea(3);
		Tarea t7 = new Tarea(4);
		Tarea t8 = new Tarea(5);

		Spike s1 = new Spike(5);
		Spike s2 = new Spike(5);
		Spike s3 = new Spike(5);

		Historia h1 = new Historia(List.of(t1, t2, t3, t4));
		Historia h2 = new Historia(List.of(t5, t6, t7, t8));

		Proyecto p = new Proyecto(List.of(h1, h2, s1, s2, s3));

		// Ejercitación
		int sumaHorasTotales = p.obtenerHorasTotales();

		// Verificacion
		int rtadoEsperado = 43;

		assertEquals(rtadoEsperado, sumaHorasTotales);
	}
}
