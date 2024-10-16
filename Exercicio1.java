import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println("Lista original: " + lista);

        inverterArrayList(lista);

        System.out.println("Lista invertida: " + lista);
    }

    public static void inverterArrayList(ArrayList<Integer> lista) {
        int tamanho = lista.size();

        for(int i = 0; i < tamanho / 2; i++){
            int temp = lista.get(i);
            lista.set(i, lista.get(tamanho - 1 -i));
            lista.set(tamanho - 1 - i, temp);
            

        }
        
    }
}