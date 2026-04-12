import java.util.Scanner;

public class Uni4Exe12 {
    private double lado1, lado2, lado3;

    public Uni4Exe12(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String verificarTriangulacao(){
        if (lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2){
            if (lado1==lado2 && lado1==lado3){
                return "Triângulo equilátero";
            }
            else if (lado1==lado2 || lado1==lado3 || lado2==lado3){
                return "Triângulo isósceles";
            }
            else {
                return "Triângulo escaleno";
            }
        }
        else { 
            return "Esses lados não formam um triângulo";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe12 objetoExe12 = new Uni4Exe12(0, 0, 0);
        System.out.println("Digite o lado 1:");
        objetoExe12.lado1 = myScanner.nextDouble();
        System.out.println("Digite o lado 2:");
        objetoExe12.lado2 = myScanner.nextDouble();
        System.out.println("Digite o lado 3:");
        objetoExe12.lado3 = myScanner.nextDouble();
        System.out.println(objetoExe12.verificarTriangulacao());
        myScanner.close();
    }
}
