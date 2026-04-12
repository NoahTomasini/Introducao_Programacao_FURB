import java.util.Scanner;

public class Uni4Exe03 {
    private int valor1, valor2;
     
    public Uni4Exe03(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public String definirMaior(){
        if ((valor1/valor2) < 1){
            return String.format("O valor %d é maior que o valor %d.", valor2, valor1);
        }
        else {
            return String.format("O valor %d é maior que o valor %d.", valor1, valor2);
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe03 objetoExe04 = new Uni4Exe03(0, 0);
        System.out.println("Digite o valor 1:");
        objetoExe04.valor1 = myScanner.nextInt();
        System.out.println("Digite o valor 2, diferente de 1:");
        objetoExe04.valor2 = myScanner.nextInt();
        System.out.println(objetoExe04.definirMaior());
        myScanner.close();
    }
}
