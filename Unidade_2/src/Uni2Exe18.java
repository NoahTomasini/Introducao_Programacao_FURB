import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o comprimento da parede em metros:");
        Double comprimento = myScanner.nextDouble();
        System.out.println("Digite a largura da parede em metros:");
        Double largura = myScanner.nextDouble();
        Double medida = comprimento*largura;
        Double azulejos = medida*9;
        Double valor = azulejos*12.50;
        System.out.println("O valor à ser pago é de: R$" + valor);
        myScanner.close();
    }
}
