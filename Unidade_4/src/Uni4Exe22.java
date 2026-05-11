import java.util.Scanner;

public class Uni4Exe22 {
    private int opcao;

    public Uni4Exe22(int opcao){
        this.opcao = opcao;
    }

    public String selecionarTitulo(){
        switch (opcao) {
            case 1:
                return "Bacharel em Ciência da Computação";
            case 2:
                return "Licenciado em Computação";
            case 3:
                return "Bacharel em Sistemas de Informação";
            default:
                return "Opção inválida";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe22 objetoExe22 = new Uni4Exe22(0);
        System.out.println("Selecione o seu curso:\n1 - Ciência da Computação"+
        "\n2 - Licenciatura da Computação\n3 -  Sistemas de Informação");
        objetoExe22.opcao = myScanner.nextInt();
        System.out.println(objetoExe22.selecionarTitulo());
        myScanner.close();
    }
}
