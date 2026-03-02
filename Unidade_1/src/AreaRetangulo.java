import java.util.Scanner;

//Se fosse um valor fixo, ex: float medida1 = 5.1, deveria ser 5.1f, ou d para double, sinalizando o tipo de variavel

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do comprimento:");
        double medida1 = scanner.nextDouble();
        System.out.println("Digite o valor da largura:");
        double medida2 = scanner.nextDouble();
        double area = medida1 * medida2;
        System.out.printf("Área da sala: %.2f m²", area);
        scanner.close();
    }
}