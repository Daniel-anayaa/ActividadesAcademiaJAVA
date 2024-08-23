package Stream2;

//Clase abstracta que representa un producto en la tienda
public abstract class Producto {
 
//Encapsulación
 private String nombre;
 private double precio;
 private int cantidad;

 //Constuctor
 public Producto(String nombre, double precio, int cantidad) {
     this.nombre = nombre;
     this.precio = precio;
     this.cantidad = cantidad;
 }
//Getters y Setters
 public String getNombre() {
     return nombre;
 }

 public double getPrecio() {
     return precio;
 }

 public int getCantidad() {
     return cantidad;
 }

 @Override
 public String toString() {
     return this.getClass().getSimpleName() + " [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
 }
}