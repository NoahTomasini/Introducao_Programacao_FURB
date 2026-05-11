import java.util.Scanner;
import java.util.Arrays;

public class Uni4Exe24 {
    private int valor1, valor2, valor3, opcao;

    public Uni4Exe24(int valor1, int valor2, int valor3, int opcao){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.opcao = opcao;
    }

    public String ordenarValores(){
        int[] valores = {valor1, valor2, valor3};
        Arrays.sort(valores);
        switch (opcao){
            case 1: //crescente
                return String.format("%d, %d, %d", valores[0], valores[1], valores[2]);
            case 2: //decrescente
                return String.format("%d, %d, %d", valores[2], valores[1], valores[0]);
            case 3: //meio, maior, menor
                return String.format("%d, %d, %d", valores[1], valores[2], valores[0]);
            default:
                return "Opção inválida";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe24 objetoExe24 = new Uni4Exe24(0,0,0,0);
        System.out.println("Digite o valor 1:");
        objetoExe24.valor1 = myScanner.nextInt();
        System.out.println("Digite o valor 2:");
        objetoExe24.valor2 = myScanner.nextInt();
        System.out.println("Digite o valor 3:");
        objetoExe24.valor3 = myScanner.nextInt();
        System.out.println("Digite a opção desejada:\n1 - Ordem crescente\n2 - Ordem decrescente\n3 - Maior valor ao meio");
        objetoExe24.opcao = myScanner.nextInt();
        System.out.println(objetoExe24.ordenarValores());
        myScanner.close();
    }
}