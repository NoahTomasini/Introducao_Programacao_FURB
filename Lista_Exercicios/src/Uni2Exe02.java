import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int valor1 = myScanner.nextInt();
        System.out.println("Digite o segundo número:");
        int valor2 = myScanner.nextInt();
        int multiplicação = valor1 * valor2;
        System.out.printf("A multiplicação dos números %d e %d é igual à %d", valor1, valor2, multiplicação);
        myScanner.close();
    }
}

