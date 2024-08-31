package Actividad0;

public class Principal {

	public static void main(String[] args) {
		
		//We make our products
		Product sodacoca = new Product("Cocacola 1lt", 20); 
		Product gansito = new Product("Gansito", 21); 

		//We create our clients
		Client client1 = new Client("Pedro", sodacoca);
		Client client2 = new Client("Sara", gansito);
			
		//We see the prints
		client1.update();
		client2.update();
		
		//Set the availability to true
		sodacoca.setAvailability(true);
		gansito.setAvailability(true);
		
		//We change the prices and update them
		sodacoca.setPrice(24);
		gansito.setPrice(30);
	}

}
