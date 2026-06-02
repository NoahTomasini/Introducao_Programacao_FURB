import java.util.Scanner;
public class Uni06Exe03 {
    Scanner myScanner = new Scanner(System.in);
    private double[] numeros;

    public Uni06Exe03(double[] numeros){
        this.numeros = new double[12];
    }

    public double[] lerNumeros(){
        for (int i = 0; i <= 11; i++){
            System.out.printf("Digite o numero (%d de 12):", i+1);
            double numero = myScanner.nextDouble();
            numeros[i] = numero;
        }
        return numeros;
    }

    public void ajustarValores(){
        for (int i = 0; i < 12; i++){
            if (i%2 != 0){
                numeros[i] = numeros[i] + (numeros[i] * 0.05);
            }
            else{
                numeros[i] = numeros[i] + (numeros[i] * 0.02);
            }
        }
    }

    public void informarNovosValores(){
        for (int i = 0; i < 12; i ++){
            System.out.printf("%nO número (%d de 12) foi atualizado para: %.2f;", i + 1, numeros[i]);
        }
    }

    public static void main(String[] args) {
        Uni06Exe03 objetoExe03 = new Uni06Exe03(null);
        objetoExe03.lerNumeros();
        objetoExe03.ajustarValores();
        objetoExe03.informarNovosValores();
    }
}

