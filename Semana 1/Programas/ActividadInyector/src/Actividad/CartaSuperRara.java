package Actividad;

public class CartaSuperRara implements TipoDeCarta {
    private int cantidad;

    // Constructor que acepta la cantidad de cartas
    public CartaSuperRara(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerRareza() { //String que indica la rareza
        return "Super Rara";
    }

    @Override
    public int obtenerCantidad() {
        return this.cantidad; 
    }
}
