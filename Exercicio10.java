import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite os números: ");
        for (int i = 0; i < quantidade; i++) {
            numeros.add(scanner.nextInt());
        }

        bubbleSortDecrescente(numeros);

        System.out.println("Lista ordenada em ordem decrescente: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void bubbleSortDecrescente(ArrayList<Integer> numeros) {
        int tamanho = numeros.size();

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {          
                if (numeros.get(j) < numeros.get(j + 1)) {
                    int temp = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, temp);
                }
            }
        }
    }
}
