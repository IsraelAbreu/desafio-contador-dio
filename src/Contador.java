import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        var numero1 = scan.nextInt();
        System.out.println("Insira o segundo número:");
        var numero2 = scan.nextInt();

        contar(numero1, numero2);
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosExceptions{
        
        if (numero1 > numero2) {
            throw new ParametrosInvalidosExceptions();
        } else {
            var contagem = numero2 - numero1;
        
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo número " + i);
            }
        }
        
    }
}
