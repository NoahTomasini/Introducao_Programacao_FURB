import java.util.Scanner;

public class Uni3Exe07 {
    private int lata, garrafa, galao;

    public Uni3Exe07(int lata, int garrafa, int galao){
        this.lata = lata;
        this.garrafa = garrafa;
        this.galao = galao;
    }

    public double calcularLitros(){
        return (lata * 0.35) + (garrafa * 0.60) + (galao * 2);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de latas compradas:");
        int lata = myScanner.nextInt();
        System.out.println("Digite a quantidade de garrafas compradas:");
        int garrafa = myScanner.nextInt();
        System.out.println("Digite a quantidade de galoes comprados:");
        int galao = myScanner.nextInt();
        Uni3Exe07 objetoExe07 = new Uni3Exe07(lata, garrafa, galao);
        double litrosComprados = objetoExe07.calcularLitros();
        System.out.printf("A quantidade de litros comprados é: %.2f", litrosComprados);
        myScanner.close();
    }
}
