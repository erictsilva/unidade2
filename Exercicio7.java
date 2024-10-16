import java.util.LinkedList;
import java.util.Queue;

public class Exercicio7 {

    public static void main(String[] args) {
        // Cria uma fila 
        Queue<String> fila = new LinkedList<>();

        // Simula a chegada de elementos na fila
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");
        fila.add("Elemento 4");
        fila.add("Elemento 5");

        // Exibe a entrada na fila
        System.out.println("Ordem de chegada na fila: ");
        for (String pessoa : fila) {
            System.out.println(pessoa);
        }

        // Exibe a remoção da fila
        System.out.println("\nOrdem de saída da fila: ");
        while (!fila.isEmpty()) {
            String pessoa = fila.poll();  // Remove o primeiro elemento da fila
            System.out.println(pessoa + " saiu da fila.");
        }
    }
}
