package Actividad;

public class CartaRara extends TipoDeCarta{

	//El string va por default en el constructor y lo unico que puede variar en el constructor es el numero de cartas

		CartaRara(int cantidad) {
		super("Rara", cantidad);
	}

	@Override
	int numero() {
		return getCantidad();
	}


}
