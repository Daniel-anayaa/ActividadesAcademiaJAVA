package Actividad;

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de CartaNormal, CartaRara y CartaSuperRara con su respectiva cantidad de cartas
        CartaNormal cartaNormal = new CartaNormal(5);  
        CartaRara cartaRara = new CartaRara(3);  
        CartaSuperRara cartaSuperRara = new CartaSuperRara(1);  

        // Pasar las cartas al usuario
        Usuario usuario1 = new Usuario(cartaNormal);
        Usuario usuario2 = new Usuario(cartaRara);
        Usuario usuario3 = new Usuario(cartaSuperRara);

        // Mostrar la información de cada carta
        usuario1.mostrarInfoCarta();
        usuario2.mostrarInfoCarta();
        usuario3.mostrarInfoCarta();
    }
}
