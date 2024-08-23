package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        // Creamos los participantes
        Casino1 participantec1_1 = new Casino1("Pablo", 4000, 1);
        Casino2 participantec2_1 = new Casino2("Jose", 3000, 3);
        Casino1 participantec1_2 = new Casino1("Maria", 3500, 10);
        Casino2 participantec2_2 = new Casino2("Ana", 2500, 9);
        Casino1 participantec1_3 = new Casino1("Luis", 4500, 4);
        Casino2 participantec2_3 = new Casino2("Laura", 3200, 5);
        Casino1 participantec1_4 = new Casino1("Carlos", 4200, 6);
        Casino2 participantec2_4 = new Casino2("Marta", 2700, 7);
        Casino1 participantec1_5 = new Casino1("Sofia", 3800, 8);
        Casino2 participantec2_5 = new Casino2("Diego", 3100, 2);

        // Creamos la lista de los participantes
        List<Casino1> Casino1Participantes = new ArrayList<>();
        List<Casino2> Casino2Participantes = new ArrayList<>();

        // Agregamos a los participantes a cada lista
        Casino1Participantes.add(participantec1_1);
        Casino1Participantes.add(participantec1_2);
        Casino1Participantes.add(participantec1_3);
        Casino1Participantes.add(participantec1_4);
        Casino1Participantes.add(participantec1_5);

        Casino2Participantes.add(participantec2_1);
        Casino2Participantes.add(participantec2_2);
        Casino2Participantes.add(participantec2_3);
        Casino2Participantes.add(participantec2_4);
        Casino2Participantes.add(participantec2_5);

        // Imprimimos los arreglos del casino 1
        System.out.println("Participantes del Casino 1");
        for (Casino1 participante : Casino1Participantes) {
            System.out.println(participante);
        }

        // Imprimimos los arreglos del casino 2
        System.out.println("Participantes del Casino 2");
        for (Casino2 participante2 : Casino2Participantes) {
            System.out.println(participante2);
        }
        System.out.println("*************************************");

        // Combinar, ordenar y filtrar los participantes de ambos casinos usando flatMap
        List<TipoDeParticipante> listanacional = Stream.of(Casino1Participantes, Casino2Participantes)
                .flatMap(List::stream) // Pega los participantes del Casino 1 y Casino 2
                .sorted(Comparator.comparingInt(TipoDeParticipante::getId)) // Ordena por ID ascendente
                .filter(p -> p.getPuntos() >= 3500) // Filtra los que tienen más de 3000 puntos
                .collect(Collectors.toList()); // Colecta los resultados en una lista

        // Printeamos todos los participantes
        listanacional.forEach(System.out::println);
    }
}
