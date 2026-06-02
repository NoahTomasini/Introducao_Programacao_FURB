import java.util.Arrays;
import java.util.Scanner;
public class Uni06Exe04 {
    Scanner myScanner = new Scanner(System.in);
    private int[] vetor1, vetor2, vetor3;

    public Uni06Exe04(int[] vetor1, int[] vetor2, int[] vetor3){
        this.vetor1 = new int[10];
        this.vetor2 = new int[10];
        this.vetor3 = new int[10];
    }

    public void lerNumeros(){
        for (int i = 0; i <= 9; i++){
            System.out.printf("Digite o numero (%d de 10 da lista 1):", i+1);
            int numero = myScanner.nextInt();
            vetor1[i] = numero;
        }
        for (int i = 0; i <= 9; i++){
            System.out.printf("Digite o numero (%d de 10 da lista 2):", i+1);
            int numero = myScanner.nextInt();
            vetor2[i] = numero;
        }
    }

    public void somarVetores(){
        for (int i = 0; i <= 9; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    public String informarVetores(){
        return String.format("%nVetor 1: %s;%nVetor 2: %s;%nVetor 3: %s.", Arrays.toString(vetor1), Arrays.toString(vetor2), Arrays.toString(vetor3));
    }

    public static void main(String[] args) {
        Uni06Exe04 objetoExe04 = new Uni06Exe04(null, null, null);
        objetoExe04.lerNumeros();
        objetoExe04.somarVetores();
        System.out.println(objetoExe04.informarVetores());
    }
}
