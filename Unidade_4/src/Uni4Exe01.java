import java.util.Scanner;

public class Uni4Exe01 {
    private double horas_trabalhadas, valor_hora;

    public Uni4Exe01(double horas_trabalhadas, double valor_hora) {
        this.horas_trabalhadas = horas_trabalhadas;
        this.valor_hora = valor_hora;
    }

    public double calcularSalario() {
        double horas_extras = horas_trabalhadas - 160.0;
        if (horas_extras != 0) {
            return (horas_trabalhadas * valor_hora) +
                    (horas_extras * (valor_hora*0.50));
        } else {
            return (horas_trabalhadas * valor_hora);
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe01 objetoExe01 = new Uni4Exe01(0, 0);
        System.out.println("Digite a quantidade de horas mensais trabalhadas" +
                " do funcionário (Ex: 40,5):");
        objetoExe01.horas_trabalhadas = myScanner.nextDouble();
        System.out.println("Digite o valor da hora" +
                " do funcionário (Ex: 25,50)");
        objetoExe01.valor_hora = myScanner.nextDouble();
        double salario = objetoExe01.calcularSalario();
        System.out.printf("O salário do funcionário é: R$%.2f", salario);
        myScanner.close();
    }
}
