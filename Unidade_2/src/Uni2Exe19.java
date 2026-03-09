import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o valor B:");
        Double valorB = myScanner.nextDouble(); 

        System.out.println("Digite o valor C:");
        Double valorC = myScanner.nextDouble(); 

        System.out.println("Digite o valor D:");
        Double valorD = myScanner.nextDouble(); 

        Double valorA = valorB * (valorC/valorD);
        System.out.println("O valor de A é: " + valorA);
        myScanner.close();
    }
}
