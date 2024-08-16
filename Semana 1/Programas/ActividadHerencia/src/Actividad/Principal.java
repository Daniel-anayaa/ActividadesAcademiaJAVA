package Actividad;

public class Principal {

    public static void main(String[] args) {
        // Crear un arreglo  de TipoDeCarta ya que es el papá
        TipoDeCarta[] cartas = new TipoDeCarta[] {
            new CartaRara(4),
            new CartaNormal(2),
            new CartaSuperRara(8)
        };

        // Mostrar la información de las cartas
        show(cartas);
    }

    // Método para mostrar la información de las cartas (Polimorfismo)
    public static void show(TipoDeCarta[] cartas) {
        for (TipoDeCarta i : cartas) {
            System.out.println(i.toString()); // Se itera cada carta que va pasando
        }
    }
}
