package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

/**
 * Laboratorio de retos para obligar a extender el codigo base de las estructuras.
 *
 * Cada reto depende de un metodo nuevo que debe implementarse directamente
 * en la clase de estructura correspondiente.
 */
public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        System.out.println();
    }

    private static void challenge1CountOccurrences() {
    	String Palabra = "LOGIN";
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("CLICK");

        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        System.out.println("Eventos: " + eventos);
        try {
            int totalLogins = eventos.countOccurrences(Palabra);
            System.out.println("Palabra a buscar: " + Palabra);
            System.out.println("Resultado obtenido: " + totalLogins);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
        eventos.reverseInPlace();
        System.out.println("Reto 3 - Poner en reverso la lista");
        System.out.println(eventos);
        eventos.removeDuplicates();
        System.out.println("Reto 2 - eliminar duplicados");
        System.out.println(eventos);
        System.out.println("Reto 2 - eliminar eventos");
        System.out.println("Eventos eliminados: " + eventos.clean() + " size: " + eventos.size());
        
       
    }

}
