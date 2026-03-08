import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a distância desejada em quilômetros: ");
        Double quilometro = myScanner.nextDouble();
        Double distancia_minutos = quilometro*2;
        System.out.printf("O carro Y demorará %.0f minutos para alcançar %.3f Km.", distancia_minutos, quilometro);
        myScanner.close();
    }
}
