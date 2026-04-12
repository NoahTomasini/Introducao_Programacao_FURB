import java.util.Scanner;

public class Uni3Exe04 {
    private double nota1;
    private double nota2;
    private double nota3;

    public Uni3Exe04(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMediaPonderada(){
        return ((nota1*5)+(nota2*3)+(nota3*2))/(5+3+2);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        double nota1 = myScanner.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = myScanner.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = myScanner.nextDouble();
        Uni3Exe04 objetoExe04 = new Uni3Exe04(nota1, nota2, nota3);
        double mediaPonderada = objetoExe04.calcularMediaPonderada();
        System.out.printf("A média ponderada é: %.2f", mediaPonderada);
        myScanner.close();
    }
}