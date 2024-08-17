package Actividad;

public class Usuario {
    private TipoDeCarta carta;

    public Usuario(TipoDeCarta carta) {
        this.carta = carta;
    }

    public void mostrarInfoCarta() { //Impresión de datos
        System.out.println("La rareza de la carta es: " + carta.obtenerRareza() + 
                           " y tienes una cantidad de: " + carta.obtenerCantidad());
    }
}
