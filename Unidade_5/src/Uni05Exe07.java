import java.util.Scanner;

public class Uni05Exe07 {
    Scanner myScanner = new Scanner(System.in);
    private int n;
    
    public Uni05Exe07(int n){
        this.n = n;
    }

    public String definirExtremos(){
        System.out.printf("Informe o número real (1 de %d): ", n);
        double numero_recebido = myScanner.nextDouble();
        double maior = numero_recebido;
        double menor = numero_recebido;

        for (int i = 2; i <= n; i++){
            System.out.printf("Informe o número real (%d de %d): ", i, n);
            numero_recebido = myScanner.nextDouble();
            if (numero_recebido < menor){
                menor = numero_recebido;
            }
            if(numero_recebido > maior){
                maior = numero_recebido;
            }
        }
        return String.format("Maior número: %.2f;%nMenor número: %.2f;", maior, menor);
    }

    public static void main(String[] args) {
        Uni05Exe07 objetoExe07 = new Uni05Exe07(0);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Quantos números você deseja inserir?:");
        objetoExe07.n = myScanner.nextInt();
        System.out.println(objetoExe07.definirExtremos());
        myScanner.close();
    }
}
