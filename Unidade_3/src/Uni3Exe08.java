import java.util.Scanner;

public class Uni3Exe08 {
    private double quantDolar;

    public Uni3Exe08(double quantDolar){
        this.quantDolar = quantDolar;
    }

    public double calcularReais(){
        return quantDolar * 5.65;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de doláres entregues pelo cliente:");
        double quantDolar = myScanner.nextDouble();
        Uni3Exe08 objetoExe08 = new Uni3Exe08(quantDolar);
        double totalReais = objetoExe08.calcularReais();
        System.out.printf("A quantidade total de reais a ser entregue é: R$%.2f", totalReais);
        myScanner.close();
    }

}
