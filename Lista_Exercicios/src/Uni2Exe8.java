import java.util.Scanner;

public class Uni2Exe8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Digite o código da peça 1: ");
        String cod1 = myScanner.nextLine();
        System.out.printf("%nDigite a quantidade de peças 1: ");
        Integer quant1 = myScanner.nextInt();
        System.out.printf("%nDigite o valor unitário da peça 1: ");
        Double valor1 = myScanner.nextDouble();
        System.out.printf("%nDigite o código da peça 2: ");
        String cod2 = myScanner.next();
        System.out.printf("%nDigite a quantidade de peças 2: ");
        Integer quant2 = myScanner.nextInt();
        System.out.printf("%nDigite o valor unitário da peça 2: ");
        Double valor2 = myScanner.nextDouble();
        Double valor_quant1 = valor1*quant1;
        Double valor_quant2 = valor2*quant2;
        Double valor_total = (valor_quant1) + (valor_quant2);
        System.out.printf("Peça(s) de código %s: %.2f%nPeça(s) de código %s: %.2f%nValor total das peças: %.2f", cod1, valor_quant1, cod2, valor_quant2, valor_total);
        myScanner.close();
    }
}
