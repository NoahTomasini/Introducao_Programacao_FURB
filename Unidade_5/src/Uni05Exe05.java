import java.util.Scanner;

public class Uni05Exe05 {
    public int n;

    public Uni05Exe05(int n){
        this.n = n;
    }

    public void escreverSequencia(){
    int contador, numero;
    numero = 8;
        for (contador = 1; contador <= n; contador++){
            if (contador == 1){
                System.out.printf("%d; ", numero);
            }
            else {
                if (contador % 2 == 0){
                    numero = numero + 2;
                    System.out.printf("%d; ", numero);
                }
                else {
                    numero = (numero - 2) * 2;
                    System.out.printf("%d; ", numero);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni05Exe05 objetoExe05 = new Uni05Exe05(0);
        System.out.println("Digite quantos números a sequência deve ter:");
        try{
            objetoExe05.n = myScanner.nextInt();
            if (objetoExe05.n <= 2){
                throw new Exception("O valor deve ser maior que 2;");
            }
            objetoExe05.escreverSequencia();
        }
        catch (Exception notintException){
            System.out.println("Quantidade inválida, insira um algarismo númerico maior que 2;");
        }
        finally{
        myScanner.close();
        }       
    }
}
