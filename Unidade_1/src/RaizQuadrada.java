import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //Raiz Quadrada
        System.out.println("Digite o radicando:");
        Double radicando = myScanner.nextDouble();
        Double raiz = Math.sqrt(radicando);
        System.out.printf("A raiz quadrada do radicando %.2f é igual à %.2f", radicando, raiz);
        myScanner.close();
    }
}