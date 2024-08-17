package Actividad;

public class CartaRara implements TipoDeCarta {
    private int cantidad;

    // Constructor que acepta la cantidad de cartas
    public CartaRara(int cantidad) {
        this.cantidad = cantidad;
    }

    
    @Override
    public String obtenerRareza() { //String que indica la rareza
        return "Rara";
    }

    @Override
    public int obtenerCantidad() {
        return this.cantidad;   
    }
}
