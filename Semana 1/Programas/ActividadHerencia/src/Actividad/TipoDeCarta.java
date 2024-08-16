package Actividad;

public abstract class TipoDeCarta {
	
	//Encapsular
	private String RarezaDeCarta; 
	private int cantidad;
	
	//Metodo que va recibir el tipo de rareza de carta y cantidad
	TipoDeCarta(String RarezaDeCarta, int cantidad) {
		this.RarezaDeCarta = RarezaDeCarta;
		this.cantidad = cantidad;
	
	}

	//Hacer los getters ya que estan encapsuladas
	
	public String getRarezaDeCarta() {
		return RarezaDeCarta;
	}


	public int getCantidad() {
		return cantidad;
	}


	//Metodos sin comportamientos
	abstract int numero();
	
	
	@Override
	public String toString() {
		return "Nombre de archivo " +this.getClass().getSimpleName() + " \nTu tipo de carta es " + RarezaDeCarta + " y tiene un numero de " +cantidad;
		
	}
	
	

}
