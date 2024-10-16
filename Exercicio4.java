import java.util.Stack;

public class Exercicio4 {
    public static void main(String[] args) {
        
        String expressao1 = "(a + b) * (c - d)";
        String expressao2 = "(a + b * (c - d)";
        String expressao3 = ")(a + b)(";
        String expressao4 = "a + d * c - b";
        
        
        System.out.println("Expressão 1 está balanceada? " + verificarBalanceamento(expressao1));
        System.out.println("Expressão 2 está balanceada? " + verificarBalanceamento(expressao2));
        System.out.println("Expressão 3 está balanceada? " + verificarBalanceamento(expressao3));
        System.out.println("Expressão 4 está balanceada? " + verificarBalanceamento(expressao4));
    }
    
    public static boolean verificarBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();
       
        for (int i = 0; i < expressao.length(); i++) {
            char ch = expressao.charAt(i);
            
            if (ch == '(') {
                pilha.push(ch);
            }
            
            else if (ch == ')') {
                
                if (pilha.isEmpty()) {
                    return false;
                }
                
                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }
}
