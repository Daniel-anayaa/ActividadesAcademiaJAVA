package Actividad;

public class CartaNormal extends TipoDeCarta{

		//El string va por default en el constructor y lo unico que puede variar en el constructor es el numero de cartas
		CartaNormal(int cantidad) {
		super("Normal", cantidad);
	}

		
	// Aquí recibe el numero de cartas y lo manda a cantidad
	@Override
	int numero() {
		return getCantidad();
	}

	

}
