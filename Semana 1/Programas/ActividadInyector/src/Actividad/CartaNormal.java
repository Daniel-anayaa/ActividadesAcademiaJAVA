package Actividad;


public class CartaNormal implements TipoDeCarta {
    private int cantidad;

    // Constructor que acepta la cantidad de cartas
    public CartaNormal(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerRareza() {
        return "Normal";
    }

    @Override
    public int obtenerCantidad() {
        return this.cantidad;  // 
    }
}
