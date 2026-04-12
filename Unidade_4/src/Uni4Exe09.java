import java.util.Scanner;

public class Uni4Exe09 {
    private int valor1, valor2;

    public Uni4Exe09(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public String verificarMultiplicidade(){
        if (valor1%valor2 != 0 && valor2%valor1 != 0){
            return "Os valores não são múltiplos.";
        }
        else { 
            return "os valores são múltiplos.";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe09 objetoExe09 = new Uni4Exe09(0, 0);
        System.out.println("Digite o valor 1:");
        objetoExe09.valor1 = myScanner.nextInt();
        System.out.println("Digite o valor 2:");
        objetoExe09.valor2 = myScanner.nextInt();
        System.out.println(objetoExe09.verificarMultiplicidade());
        myScanner.close();
    }
}
