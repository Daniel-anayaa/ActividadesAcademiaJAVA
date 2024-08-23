package Stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

		        // Creación de productos
		        Laptop laptop1 = new Laptop("Laptop A", 1000.0, 50);
		        Smartphone smartphone1 = new Smartphone("Smartphone X", 800.0, 30);
		        Tablet tablet1 = new Tablet("Tablet Z", 500.0, 70);
		        Laptop laptop2 = new Laptop("Laptop B", 1200.0, 20);
		        Smartphone smartphone2 = new Smartphone("Smartphone Y", 900.0, 60);
		        Tablet tablet2 = new Tablet("Tablet W", 450.0, 10);
		
		        // Listas de productos
		        List<Laptop> laptops = new ArrayList<>();
		        List<Smartphone> smartphones = new ArrayList<>();
		        List<Tablet> tablets = new ArrayList<>();
		
		        // Añadir productos a las listas
		        laptops.add(laptop1);
		        laptops.add(laptop2);
		        smartphones.add(smartphone1);
		        smartphones.add(smartphone2);
		        tablets.add(tablet1);
		        tablets.add(tablet2);

		        // Operaciones de Stream
		        List<Producto> inventario = Stream.of(laptops, smartphones, tablets)
		                .flatMap(List::stream) // Combina todas las listas en un solo Stream
		                .filter(p -> p.getPrecio() > 600) // Filtra productos con un precio superior a 600
		                .sorted(Comparator.comparingDouble(Producto::getPrecio)) // Ordena por precio ascendente
		                .collect(Collectors.toList()); // Recolecta los resultados en una lista
		
		        // Imprimir los productos filtrados y ordenados
		        inventario.forEach(System.out::println);

		        // Otra operación: Obtener productos con alto inventario (cantidad > 50)
		        List<Producto> altoInventario = inventario.stream()
		                .filter(p -> p.getCantidad() > 50) // Filtra productos con alto inventario
		                .collect(Collectors.toList());
		        System.out.println("***************************");

		        // Imprimir productos con alto inventario
		        System.out.println("Productos con alto inventario:");
		        altoInventario.forEach(System.out::println);
		    }
		}
