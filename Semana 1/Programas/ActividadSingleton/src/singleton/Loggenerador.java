package singleton;

public class Loggenerador {

    // Se encapsula para que no se puedan crear varias instancias del objeto
    private static Loggenerador instanciaUnica;

    // Constructor privado para evitar la creación de múltiples instancias por otros programas
    private Loggenerador() {
        
    }

    // Método estático para obtener la única instancia de Logger en la clase, solo se accede por getInstance()
    public static Loggenerador getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Loggenerador();  // Crear la instancia si no existe debido al lazy inicialización
        }
        return instanciaUnica;  // Devolver la instancia única a los demás si es que ya existe una instanciaunica
    }

    // String que se va imprimir cuando se utilice el metodo
    public void log(String mensaje) {
        System.out.println("Log: " + mensaje);  // Imprimir el mensaje en la consola
    }
}

