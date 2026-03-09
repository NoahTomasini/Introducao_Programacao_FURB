import java.util.Scanner;

public class CalculadoraV2 {
    private double numero1, numero2;

    public CalculadoraV2(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double subtrair(){
        return numero1 - numero2;
    }
    public double somar(){
        return numero1 + numero2;
    }
    public double dividir(){
        return numero1 / numero2;
    }
    public double multiplicar(){
        return numero1 * numero2;
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o número 1:");
        Double n1 = myScanner.nextDouble();
        System.out.println("Digite o número 2:");
        Double n2 = myScanner.nextDouble();
        CalculadoraV2 calc = new CalculadoraV2(n1, n2);
        Double resultado = calc.subtrair();
        System.out.println("O resultado é:" + resultado);
        resultado = calc.dividir();
        System.out.println("O resultado é:" + resultado);
        myScanner.close();
    }
}
