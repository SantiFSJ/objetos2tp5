package ar.unrn.tp5.modelo;

public class RemeraImportada extends Remera {
	public RemeraImportada(double precio) {
		super(precio);
	}

	@Override
	protected double sumarRecargos(Double precioUnitario) {
		return precioUnitario + precioUnitario * 0.03 + precioUnitario * 0.05 + precioUnitario * 0.25;
	}
}
