//igual a try except
import java.util.Scanner;
public class trycatch {
    int numero;

    public trycatch (int numero){
        this.numero = numero;
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        trycatch objTrycatch = new trycatch(0);
        System.out.println("Digite um número:");
        try {
            objTrycatch.numero = myScanner.nextInt();
        }
        catch (Exception ex){ //variavel do erro, para referencia-la em caso de logs
            System.out.println("Número inválido");
            objTrycatch.numero = 0;
        }
        myScanner.close();
    }
}
