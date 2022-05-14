package ar.unrn.tp5.modelo;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	protected double mesConPromocion(double precioProducto) {
		return precioProducto + precioProducto * 0.15;
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return precioProducto + precioProducto * 0.21;
	}

}