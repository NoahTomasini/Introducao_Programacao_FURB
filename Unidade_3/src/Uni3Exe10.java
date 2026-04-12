import java.util.Scanner;

public class Uni3Exe10 {
    private double catetoOposto, catetoAdjacente;

    public Uni3Exe10(double catetoOposto, double catetoAdjacente) {
        this.catetoOposto = catetoOposto;
        this.catetoAdjacente = catetoAdjacente;
    }

    public double calcularHipotenusa(){
        return Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Informe o comprimento do cateto oposto: ");
        double catetoOposto = myScanner.nextDouble();
        System.out.println("Informe o comprimento do cateto adjacente: ");
        double catetoAdjacente = myScanner.nextDouble();
        Uni3Exe10 objetoExe10 = new Uni3Exe10(catetoOposto, catetoAdjacente);
        double hipotenusa = objetoExe10.calcularHipotenusa();

        System.out.printf("O comprimento da hipotenusa é: %.2f", hipotenusa);
        myScanner.close();
    }
}
