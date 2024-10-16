import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
       
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(2);
        lista1.add(3);
        lista1.add(6);
        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(4);
        lista2.add(3);
        
        ArrayList<Integer> listaIntercalada = intercalarListas(lista1, lista2);
        
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista intercalada: " + listaIntercalada);
    }
    
    public static ArrayList<Integer> intercalarListas(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> listaIntercalada = new ArrayList<>();
        int tamanho1 = lista1.size();
        int tamanho2 = lista2.size();
        int maxSize = Math.max(tamanho1, tamanho2);  
        
        for (int i = 0; i < maxSize; i++) {
            if (i < tamanho1) {
                listaIntercalada.add(lista1.get(i)); 
            }
            if (i < tamanho2) {
                listaIntercalada.add(lista2.get(i)); 
            }
        }
        
        return listaIntercalada;
    }
}
