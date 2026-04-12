import java.util.Scanner;

public class Uni3Exe11 {
    private Double celsius;

    public Uni3Exe11(Double celsius){
        this.celsius = celsius;
    }

    public Double calcularFahrenheit(){
        return ((1.8d * celsius) + 32d);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em C°: ");
        Double celsius = myScanner.nextDouble();

        Uni3Exe11 objetoExe11 = new Uni3Exe11(celsius);

        System.out.println("A temperatura equivale à "+ objetoExe11.calcularFahrenheit()+ " F°");
        myScanner.close();
    }
}
