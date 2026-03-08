import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o valor A:");
        Double valorA = myScanner.nextDouble();
        System.out.println("Digite o valor B:");
        Double valorB = myScanner.nextDouble();
        System.out.println("Digite o valor C:");
        Double valorC = myScanner.nextDouble();
        //Área triângulo retângulo base A e altura C
        Double operacao1 = (valorA*valorC)/2.0;
        //Área círculo de raio C
        Double operacao2 = Math.pow(valorC, 2.0) * Math.PI;
        //Área trapézio de base A e B, e altura C
        Double operacao3 = ((valorA + valorB) * valorC)/2.0;
        //Área quadrado de lado B
        Double operacao4 = valorB * valorB;
        //Área retângulo de lado A e B
        Double operacao5 = valorA * valorB;
        System.out.println("Área triângulo retângulo base A e altura C: " + operacao1);
        System.out.println("Área círculo de raio C: " + operacao2);
        System.out.println("Área trapézio de base A e B, e altura C: " + operacao3);
        System.out.println("Área quadrado de lado B: " + operacao4);
        System.out.println("Área retângulo de lado A e B: " + operacao5);
        myScanner.close();
    }
}
