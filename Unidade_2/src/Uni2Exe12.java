import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o valor de eixo X do ponto p1: ");
        Double ponto1_x = myScanner.nextDouble();
        System.out.println("Digite o valor de eixo Y do ponto p1: ");
        Double ponto1_y = myScanner.nextDouble();
        System.out.println("Digite o valor de eixo X do ponto p2: ");
        Double ponto2_x = myScanner.nextDouble();
        System.out.println("Digite o valor de eixo Y do ponto p2: ");
        Double ponto2_y = myScanner.nextDouble();
        Double distancia = Math.sqrt(Math.pow(ponto2_x - ponto1_x , 2.0) + Math.pow(ponto2_y - ponto1_y, 2.0));
        System.out.printf("A distância entre o ponto p1(%.2f; %.2f) e o ponto p2(%.2f; %.2f) é igual à: %.4f", ponto1_x, ponto1_y, ponto2_x, ponto2_y, distancia);
        myScanner.close();
    }
}
