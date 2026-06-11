import java.util.Scanner;

public class Uni4Exe26 {
    private char opcao;
    Scanner myScanner = new Scanner(System.in);

    public Uni4Exe26(char opcao){
        this.opcao = opcao;
    }

    public double selecionarOpcao(){
        switch (opcao) {
            case 'T':
                System.out.println("Digite a base:");
                int baseTri = myScanner.nextInt();
                System.out.println("Digite a altura:");
                int alturaTri = myScanner.nextInt();
                return (baseTri * alturaTri)/2;
            case 'Q':
                System.out.println("Digite o lado:");
                int lado = myScanner.nextInt();
                return lado*lado;
            case 'R':
                System.out.println("Digite a base:");
                int baseQua = myScanner.nextInt();
                System.out.println("Digite a altura:");
                int alturaQua = myScanner.nextInt();
                return (baseQua * alturaQua);
            case 'C':
                System.out.println("Digite o raio:");
                int raio = myScanner.nextInt();
                return Math.PI*Math.pow(raio, 2);
            default:
                throw new IllegalArgumentException("Insira uma opção válida.");
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe26 objetoExe26 = new Uni4Exe26('0');
        System.out.println("Escolha a opção:\nT - Área do triângulo\nQ - Área do quadrado\nR - Área do retângulo\nC - Área do círculo");
        objetoExe26.opcao = Character.toUpperCase(myScanner.next().charAt(0));
        System.out.println(objetoExe26.selecionarOpcao());
        myScanner.close();
    }
}
