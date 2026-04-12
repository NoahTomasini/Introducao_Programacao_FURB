import java.util.Scanner;

public class Uni3Exe05 {
    private double precoPerGalinha;
    private int quantGalinhas;

    public Uni3Exe05(double precoPerGalinha, int quantGalinhas){
        this.precoPerGalinha = precoPerGalinha;
        this.quantGalinhas = quantGalinhas;
    }

    public double calcularPrecoGranja(){
        return precoPerGalinha*quantGalinhas;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de galinhas na granja:");
        int quantGalinhas = myScanner.nextInt();
        double precoPerGalinha = 4.00d + 3.50d + 3.50d;
        Uni3Exe05 objetoExe05 = new Uni3Exe05(precoPerGalinha, quantGalinhas);
        double precoGranja = objetoExe05.calcularPrecoGranja();
        System.out.printf("O preço total da granja é: R$%.2f", precoGranja);
        myScanner.close();
    }
}
