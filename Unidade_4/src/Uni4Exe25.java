import java.util.Scanner;

public class Uni4Exe25 {
    private int opcao, valor1, valor2;

    public Uni4Exe25(int opcao, int valor1, int valor2){
        this.opcao = opcao;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int realizarOperacao(){
        switch (opcao) {
            case 1:
                return valor1 + valor2;
            case 2: 
                return Math.abs(valor1 - valor2);
            case 3:
                return valor1 * valor2;
            case 4:
                if (valor2 != 0){
                    return valor1/valor2;
                }
                else {
                    throw new IllegalArgumentException("Entende-se o que valor 2 é o denominador, e esse não deve ser zero.");
                }
            default:
                throw new IllegalArgumentException("Insira uma opção válida.");
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe25 objetoExe25 = new Uni4Exe25(0, 0, 0);
        System.out.println("Digite o valor 1:");
        objetoExe25.valor1 = myScanner.nextInt();
        System.out.println("Digite o valor 2:");
        objetoExe25.valor2 = myScanner.nextInt();
        System.out.println("Digite a opção desejada:\n1 - Soma\n2 - Diferença entre os valores\n3 - Multiplicação\n4 - Divisão do valor 1 pelo valor 2");
        objetoExe25.opcao = myScanner.nextInt();
        System.out.println(objetoExe25.realizarOperacao());
        myScanner.close();
    }

}
