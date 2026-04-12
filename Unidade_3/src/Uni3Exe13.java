import java.util.Scanner;

public class Uni3Exe13 {
    private double comprimento, altura;

    public Uni3Exe13(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public double MetrosQuadrados(){
      return altura * comprimento;
    }

    public double totalGasto(){
         return ((MetrosQuadrados() * 9) * 12.50d);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o comprimento da parede: ");
        double comprimento = myScanner.nextDouble();
        System.out.println("Digite a altura da parede: ");
        double altura = myScanner.nextDouble();
        
        Uni3Exe13 objetoExe13 = new Uni3Exe13(comprimento, altura);

        double totalGasto = objetoExe13.totalGasto();
        System.out.printf("O valor total gasto vai ser de : %.2f reais", totalGasto);
        myScanner.close();
    }
}
