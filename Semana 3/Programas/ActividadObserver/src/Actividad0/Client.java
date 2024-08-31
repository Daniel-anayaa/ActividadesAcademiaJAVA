package Actividad0;

	public class Client extends Observer {

	    private String name;

	    public Client(String name, Subject product) {
	        super(product); // Takes the product automatically
	        this.name = name;
	    }

	    @Override
	    public void update() {
	        Product Product = (Product) sub; // We cast the subject
	        System.out.println("Hello " + name + ", the product " + Product.getName() + 
	                           " has new updates. Price: " + Product.getPrice() + 
	                           ", Availability: " + (Product.isAvailable() ? "Yes" : "No"));
	    }
	}

