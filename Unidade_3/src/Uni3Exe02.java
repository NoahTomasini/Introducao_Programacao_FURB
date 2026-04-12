import java.util.Scanner;

public class Uni3Exe02 {
    private double precoSapato;
    private double descontoSapato;

    public Uni3Exe02(double precoSapato, double descontoSapato){
        this.precoSapato = precoSapato;
        this.descontoSapato = descontoSapato;
    }

    public double calcularContaFinal(){
        return precoSapato - descontoSapato;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o preço do calçado: ");
        double precoSapato = myScanner.nextDouble();
        double descontoSapato = precoSapato * 0.12;
        Uni3Exe02 objetoExe02 = new Uni3Exe02(precoSapato, descontoSapato);
        double contaFinal = objetoExe02.calcularContaFinal();
        System.out.printf("O preço do desconto é: %.2f reais", descontoSapato);
        System.out.printf("%nO preço final é: %.2f reais", contaFinal);
        myScanner.close();
    }
}