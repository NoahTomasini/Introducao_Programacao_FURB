import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de latas compradas: ");
        Integer latas = myScanner.nextInt();
        System.out.println("Digite a quantidade de garrafas compradas: ");
        Integer garrafas = myScanner.nextInt();
        System.out.println("Digite a quantidade de garrafões comprados: ");
        Integer garrafoes = myScanner.nextInt();
        Double litros = (latas*0.350) + (garrafas*0.600) + (garrafoes*2);
        System.out.printf("A quantidade total de litros comprados é de: %.3f", litros);
        myScanner.close();
    }
}
