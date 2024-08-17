package Actividad;

public class Inyector {

    // Inyector de una carta normal 
    public static Usuario inyectarCartaNormal(int cantidad) {
        TipoDeCarta carta = new CartaNormal(cantidad);
        return new Usuario(carta);
    }

    //Inyector de carta rara  
    public static Usuario inyectarCartaRara(int cantidad) {
        TipoDeCarta carta = new CartaRara(cantidad);
        return new Usuario(carta);
    }

    // Inyector de una carta super rara 
    public static Usuario inyectarCartaSuperRara(int cantidad) {
        TipoDeCarta carta = new CartaSuperRara(cantidad);
        return new Usuario(carta);
    }
}
