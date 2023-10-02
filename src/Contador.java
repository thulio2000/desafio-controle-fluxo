import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Insira o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        terminal.close();
        try {
            //lógica contagem
            contar(parametroUm, parametroDois);            
        } catch(ParametrosInvalidosException err) {
            System.err.println("O segundo parametro deve ser maior do que o primeiro.");

            //print msg: o parâmetro 2 deve ser maior que o primeiro
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        //validar se parametroUm é maior que dois e lançar a exceção
        if (contagem < 0) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
            }
        }
        
        //realizar o for para imprimir os números com base na variável contagem;
        

    }
}