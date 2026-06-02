import java.util.Scanner;
public class Uni06Exe01 {
    Scanner myScanner = new Scanner(System.in);
    private int[] numeros;
    public Uni06Exe01(int[] numeros){
        this.numeros = new int[10];
    }
    public void lerNumerosVetor(){
        for (int i = 0; i < 10; i++){
            System.out.printf("Digite um número (%d de 10):", i+1);
            int numero = myScanner.nextInt();
            numeros[i] = numero;
        }
        escreverNumerosInvertidos();
    }

    public void escreverNumerosInvertidos(){
        for (int i = 9; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }

    public static void main(String[] args) {
        Uni06Exe01 objetoExe01 = new Uni06Exe01(null);
        objetoExe01.lerNumerosVetor();
    }
}
