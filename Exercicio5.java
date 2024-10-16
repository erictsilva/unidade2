import java.util.ArrayList;
import java.util.Stack;

public class Exercicio5 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        
        System.out.println("Lista original: " + lista);        
        inverterArrayListComPilha(lista);        
        System.out.println("Lista invertida: " + lista);
    }
    
    public static void inverterArrayListComPilha(ArrayList<Integer> lista) {
        Stack<Integer> pilha = new Stack<>();        
        for (int i = 0; i < lista.size(); i++) {
            pilha.push(lista.get(i));
        }        
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, pilha.pop());
        }
    }
}
