import java.util.Scanner;
public class Uni06Exe02 {
    Scanner myScanner = new Scanner(System.in);
    private double[] numeros;
    private double media;

    public Uni06Exe02(double[] numeros, double media){
        this.media = media;
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

    public double calcularMedia(){
        media = 0;
        for (int i = 0; i < 12; i++){
            media = media + numeros[i];
        }
        media = media/12;
        return media;
    }

    public void informarMaiores(){
    //informa quais valores da lista sao maiores que a media dessa;
    int contador = 0;
        for (int i = 0; i < 12; i ++){
            if (numeros[i] > media){
                contador ++;
                System.out.printf("%nO número %.2f é maior que a média %.2f - correspondente aos valores informados;", numeros[i], media);
            }
        }
        if (contador == 0){
            System.out.printf("A média dos valores é %.2f, e nenhum dos valores informados é maior do que essa;", media);
        }
    }

    public static void main(String[] args) {
        Uni06Exe02 objetoExe02 = new Uni06Exe02(null, 0);
        objetoExe02.lerNumeros();
        objetoExe02.calcularMedia();
        objetoExe02.informarMaiores();
    }
}
