import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        lista.add(5);        
        
        System.out.println("Lista original: " + lista);
        
        removerDuplicados(lista);
        
        System.out.println("Lista sem duplicados: " + lista);
    }
        
    public static void removerDuplicados(ArrayList<Integer> lista) {
        ArrayList<Integer> listaSemDuplicados = new ArrayList<>();
        
        for (Integer elemento : lista) {
            
            if (!listaSemDuplicados.contains(elemento)) {
                listaSemDuplicados.add(elemento);
            }
        }
        
        lista.clear();
        lista.addAll(listaSemDuplicados);
    }
}
