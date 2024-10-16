import java.util.HashMap;
import java.util.Map;

public class Exercicio9 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put("1: ", 1);
        mapa1.put("2: ", 2);
        mapa1.put("3: ", 3);

        HashMap<String, Integer> mapa2 = new HashMap<>();
        mapa2.put("2: ", 4);
        mapa2.put("3: ", 5);
        mapa2.put("4: ", 6);

        System.out.println("Mapa 1: " + mapa1);
        System.out.println("Mapa 2: " + mapa2);

        mesclarMapas(mapa1, mapa2);

        System.out.println("Mapa mesclado: " + mapa1);
    }

    public static void mesclarMapas(HashMap<String, Integer> mapa1, HashMap<String, Integer> mapa2) {
        for (Map.Entry<String, Integer> entry : mapa2.entrySet()) {
            String chave = entry.getKey();
            Integer valor = entry.getValue();

            if (mapa1.containsKey(chave)) {
                mapa1.put(chave, mapa1.get(chave) + valor);
            } else {
                mapa1.put(chave, valor);
            }
        }
    }
}