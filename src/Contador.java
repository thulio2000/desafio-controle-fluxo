import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Insira o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            //lógica contagem
            contar(parametroUm, parametroDois);            
        } catch( err) {
            //print msg: o parâmetro 2 deve ser maior que o primeiro
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é maior que dois e lançar a exceção
        
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem;
    }
}