import java.util.Scanner;

public class Uni3Exe09 {
    private double raio, altura;

    public Uni3Exe09(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume(){
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o raio da lata de óleo em centímetros:");
        double raio =  myScanner.nextDouble();
        System.out.println("Digite a altura da lata de óleo em centímetros:");
        double altura =  myScanner.nextDouble();
        Uni3Exe09 objetoExe09 = new Uni3Exe09(raio, altura);
        double volume = objetoExe09.calcularVolume();
        System.out.printf("O volume total da lata é de: %.2fml", volume);
        myScanner.close();
    }
}
