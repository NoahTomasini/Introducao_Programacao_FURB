import java.util.Scanner;

public class Uni2Exe5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int valorA = myScanner.nextInt();
        System.out.println("Digite o valor de B:");
        int valorB= myScanner.nextInt();
        System.out.println("Digite o valor de C:");
        int valorC= myScanner.nextInt();
        System.out.println("Digite o valor de D:");
        int valorD= myScanner.nextInt();
        int diferenca = (valorA * valorB) - (valorC * valorD);
        System.out.printf("A diferença do produto de A x B pelo produto de C x D é %d", diferenca);
        myScanner.close();
    }
}