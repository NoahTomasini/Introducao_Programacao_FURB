import java.util.Scanner;

public class Uni2Exe3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência:");
        Double raio = myScanner.nextDouble();
        Double circunferencia = Math.pow(raio, 2) * Math.PI;
        System.out.printf("A circunferência do círculo é %.2f", circunferencia);
        myScanner.close();
    }
}
