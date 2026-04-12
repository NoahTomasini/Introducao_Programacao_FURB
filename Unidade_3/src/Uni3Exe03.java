import java.util.Scanner;

public class Uni3Exe03 {
    private double precoGasolina;
    private double valorPago;

    public Uni3Exe03(double precoGasolina, double valorPago){
        this.precoGasolina = precoGasolina;
        this.valorPago = valorPago;
    }

    public double calcularLitrosGasolina(){
        return valorPago/precoGasolina;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double precoGasolina, valorPago;
        System.out.println("Digite o preço da gasolina:");
        precoGasolina = myScanner.nextDouble();
        System.out.println("Digite o valor pago:");
        valorPago = myScanner.nextDouble();
        Uni3Exe03 objetoExe03 = new Uni3Exe03(precoGasolina, valorPago);
        double litrosGasolina = objetoExe03.calcularLitrosGasolina();
        System.out.printf("Deve ser inserido %.1f litros de gasolina.", litrosGasolina);
        myScanner.close();
    }

}
