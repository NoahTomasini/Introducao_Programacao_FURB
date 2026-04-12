import java.util.Scanner;

public class Uni3Exe06 {
    private double pesoPrato;

    public Uni3Exe06(double pesoPrato){
        this.pesoPrato = pesoPrato;
    }

    public double custearPrato(){
        return (pesoPrato - 0.750d) * 25.00d;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Insira o peso em quilos do prato:");
        double pesoPrato = myScanner.nextDouble();
        Uni3Exe06 objetoExe06 = new Uni3Exe06(pesoPrato);
        double precoTotal = objetoExe06.custearPrato();
        System.out.printf("O preço a ser pago é: R$%.2f", precoTotal);
        myScanner.close();
    }
}
