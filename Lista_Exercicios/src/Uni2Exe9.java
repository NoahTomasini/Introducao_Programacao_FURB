import java.util.Scanner;

public class Uni2Exe9 {
    public static void main(String[] args) {
        Scanner Roberto = new Scanner(System.in);
        System.out.println("Digite a quantia em dólares para a conversão: ");
        Double dolar = Roberto.nextDouble();
        Double cotacao = 5.24d;
        Double real = dolar*cotacao;
        System.out.println("Você deve devolver um total de: R$" + real);
        Roberto.close();
    }
}
