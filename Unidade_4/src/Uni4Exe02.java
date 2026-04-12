import java.util.Scanner;

public class Uni4Exe02 {
    private int valor;
    public Uni4Exe02(int valor){
        this.valor = valor;
    }
    public String verificarParidade(){
        if ((valor % 2) != 0){
            return "O número é ímpar.";
        }
        else {
            return "O número é par.";
        }
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe02 objetoExe02 = new Uni4Exe02(0);
        System.out.println("Digite um número inteiro:");
        objetoExe02.valor = myScanner.nextInt();
        System.out.println(objetoExe02.verificarParidade());
        myScanner.close();
    }
} 
