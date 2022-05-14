package ar.unrn.tp5.modelo;

public class RemeraNacional extends Remera {
	public RemeraNacional(double precio) {
		super(precio);
	}

	@Override
	protected double sumarRecargos(Double precioUnitario) {
		return precioUnitario + precioUnitario * 0.015 - precioUnitario * 0.20 + precioUnitario * 0.15;
	}

}
