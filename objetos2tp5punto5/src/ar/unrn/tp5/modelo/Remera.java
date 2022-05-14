package ar.unrn.tp5.modelo;

public abstract class Remera {
	private double precio;

	public Remera(double precio) {
		this.precio = precio;
	}

	public double obtenerPrecioFinal() {
		return sumarRecargos(this.precio);
	}

	protected abstract double sumarRecargos(Double precioUnitario);

}
