import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String [] args){
        Queue<String> filaDeEspera = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

    while (continuar){
        System.out.println("\nSistema de Fila de Espera.");
        System.out.println("\n1. Adicionar Nome à Fila de Espera: ");
        System.out.println("2. Nome na Fila de Espera: ");
        System.out.println("3. Remover Nome da Fila de Espera: ");
        System.out.println("4. Sair do Programa.");
        System.out.print("\nEscolha uma Opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            //adicionar nome
            case 1:
                System.out.print("\nDigite o nome à ser adicionado: ");
                String nomeAdiciona = scanner.nextLine();
                filaDeEspera.add(nomeAdiciona);
                System.out.println("\nNome ' " + nomeAdiciona + " ' adicionado com sucesso!");
            break;
            case 2:
            //ver fila de espera
                System.out.print("\nFila de espera: " + filaDeEspera);
                break;
            case 3: 
            //remover nome
                System.out.print("Digite o nome para remover: ");
                String nomeRemover = scanner.nextLine();                               
                if (filaDeEspera.contains(nomeRemover)) { 
                    filaDeEspera.remove(nomeRemover);        
                    System.out.println("Nome ' " + nomeRemover + " ' foi removido com sucesso!");                        
                }else {
                        System.out.println("Nome ' " + nomeRemover + " ' não esta na fila.");
            }
                break;
            case 4:
            //sair do programa
            System.out.println("Saindo do sistema. Até logo!");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
        }
    }
    scanner.close();
    
}

}
    
