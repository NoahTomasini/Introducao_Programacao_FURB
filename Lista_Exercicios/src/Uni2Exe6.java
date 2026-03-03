import java.util.Scanner;

public class Uni2Exe6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o id do funcionário:");
        int id = myScanner.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas do funcionário (ex: 40,5h):");
        Double horas = myScanner.nextDouble();
        System.out.println("Digite o valor da hora do funcionário (ex: 14,50):");
        Double valor_hora = myScanner.nextDouble();
        Double salario = horas * valor_hora;
        System.out.printf("ID do funcionário: %d" , id);
        System.out.printf("\nSalário: R$%.2f", salario);
        myScanner.close();
    }
}
