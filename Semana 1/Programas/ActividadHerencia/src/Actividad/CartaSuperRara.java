package Actividad;

public class CartaSuperRara extends TipoDeCarta{
		
		//Se establece el string de superrara y lo unico que recibe es el numero de cartas
		CartaSuperRara(int cantidad) {
		super("SuperRara", cantidad);
	}

	//Recibe el numero de cartas cuando se hace el NEW
	@Override
	int numero() {
		return getCantidad();
	}

	

}
