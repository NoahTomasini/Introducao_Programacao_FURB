import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor da média:");
        double valor1 = myScanner.nextDouble();
        System.out.println("Digite o segundo valor da média:");
        double valor2 = myScanner.nextDouble();
        double media = ((valor1 * 3.5) + (valor2 * 7.5))/11.0;
        System.out.printf("A média é: %.2f", media);
        myScanner.close();
    }
}
