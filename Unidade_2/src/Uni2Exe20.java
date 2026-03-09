import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o número de dobras, lembre de sempre informar um número par:");
        Integer dobras = myScanner.nextInt();
        Integer quadrados = Math.powExact(dobras, 2);
        System.out.println("O número de quadrados resultantes é: " + quadrados);
        myScanner.close();
    }
}
