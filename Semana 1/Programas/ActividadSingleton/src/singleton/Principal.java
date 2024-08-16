package singleton;

public class Principal {
    public static void main(String[] args) {

        // Generador de Log 1
    	Loggenerador logger1 = Loggenerador.getInstance();
    	
        // Generador de Log 2
    	Loggenerador logger2 = Loggenerador.getInstance();
    	 
    	// Generador de Log 3
    	Loggenerador logger3 = Loggenerador.getInstance();

        // Registrar los mensajes en el metodo log
        logger1.log("Este es el primer mensaje de log.");
        logger2.log("Este es el segundo mensaje de log.");
        logger3.log("Este es el tercer mensaje de log.");

        // Verificar que las tres referencias apuntan al mismo objeto
        if (logger1 == logger2 && logger1 == logger3) {
            System.out.println("logger1, 2 y 3 son la misma instancia.");
        } else {
            System.out.println("logger1, 2 y 3 son diferentes instancias.");
        }
    }
}
