package objetos2tp5punto3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unrn.tp5.modelo.Paquete;
import ar.unrn.tp5.modelo.SeguroRegular;

public class TestLolete {
	@Test
	public void sumaDeSalariosNormal() {
		SeguroRegular sr1 = new SeguroRegular(25);
		SeguroRegular sr2 = new SeguroRegular(25);
		SeguroRegular sr3 = new SeguroRegular(25);
		SeguroRegular sr4 = new SeguroRegular(25);
		SeguroRegular sr5 = new SeguroRegular(25);
		SeguroRegular sr6 = new SeguroRegular(25);
		SeguroRegular sr7 = new SeguroRegular(25);
		SeguroRegular sr8 = new SeguroRegular(25);
		Paquete p1 = new Paquete(List.of(sr1, sr2, sr3, sr4));
		Paquete p2 = new Paquete(List.of(sr5, sr6, sr7, sr8));
		Paquete p3 = new Paquete(List.of(p1, p2));
		assertEquals(150.0, p3.calcularMonto());

	}
}
