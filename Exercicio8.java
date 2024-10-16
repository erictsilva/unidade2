import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.toLowerCase().split("\\s+"); 

        Map<String, Integer> contagemPalavras = new HashMap<>();

        for (String palavra : palavras) {
            if (contagemPalavras.containsKey(palavra)) {
                contagemPalavras.put(palavra, contagemPalavras.get(palavra) + 1);
            } else {
                contagemPalavras.put(palavra, 1);
            }
        }
        System.out.println("\nFrequência das palavras: ");
        for (Map.Entry<String, Integer> entrada : contagemPalavras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
