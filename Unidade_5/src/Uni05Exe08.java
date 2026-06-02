import java.util.Scanner;
public class Uni05Exe08 {
    Scanner myScanner = new Scanner(System.in);
    private int n;
    
    public Uni05Exe08(int n){
        this.n = n;
    }

    public String definirValores(){
        int numero_recebido;
        int menor_negativo = 0, contador = 0;
        double media_positivo = 0;

        for (int i = 1; i <= n; i++){
            System.out.printf("Informe o número inteiro (%d de %d): ", i, n);
            numero_recebido = myScanner.nextInt();
            if (numero_recebido < 0 && numero_recebido < menor_negativo){
                menor_negativo = numero_recebido;
            }
            if(numero_recebido > 0){
                media_positivo = media_positivo + numero_recebido;
                contador++;
            }
        }
        media_positivo = media_positivo/contador;
        if (menor_negativo >= 0){
            return String.format("Menor valor negativo: não foi inserido negativos;%nMédia dos números positivos: %.2f", media_positivo);
        }
        else{
            return String.format("Menor valor negativo: %d;%nMédia dos números positivos: %.2f;", menor_negativo, media_positivo);
        }
    }

    public static void main(String[] args) {
        Uni05Exe08 objetoExe08 = new Uni05Exe08(0);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Quantos números você deseja inserir?:");
        objetoExe08.n = myScanner.nextInt();
        System.out.println(objetoExe08.definirValores());
        myScanner.close();
    }
}
