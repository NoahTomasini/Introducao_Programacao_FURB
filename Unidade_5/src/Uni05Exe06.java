
import java.util.Scanner;

public class Uni05Exe06 {
    Scanner myScanner = new Scanner(System.in);

    public String calcularMedia(){
        double soma_alturas = 0;
        for (int i = 1; i <= 20; i++){
            System.out.println("Digite a altura (ex: 1,80):");
            double altura = myScanner.nextDouble();
            soma_alturas = soma_alturas + altura;
        }
        double media = soma_alturas/20;
        return String.format("A média das alturas é: %.2f", media);
    }

    public static void main(String[] args) {
        Uni05Exe06 objetoExe06 = new Uni05Exe06();
        System.out.println(objetoExe06.calcularMedia());
        objetoExe06.myScanner.close();
    }
}
