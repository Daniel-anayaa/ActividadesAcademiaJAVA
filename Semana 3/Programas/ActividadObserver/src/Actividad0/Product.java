package Actividad0;
import java.util.*;

	public class Product extends Subject {

	    private String name;
	    private double price;
	    private boolean available;

	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	        this.available = false; // Product not available by default
	    }

	    public void setPrice(double newprice) {
	        this.price = newprice;
	        notifyobservers(); // //Notify the program when the product changes prices
	    }

	    public void setAvailability(boolean available) {
	        this.available = available;
	        notifyobservers(); // Notify to the clients when the product is available
	    }

	    public double getPrice() {
	        return price;
	    }

	    public boolean isAvailable() {
	        return available;
	    }

	    public String getName() {
	        return name;
	    }
	}


