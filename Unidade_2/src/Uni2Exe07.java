import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor(a):");
        String nome = myScanner.nextLine();
        System.out.println("Digite o salário do vendedor(a):");
        Double salario = myScanner.nextDouble();
        System.out.println("Digite o total de vendas mensais em dinheiro do vendedor(a):");
        Double vendas = myScanner.nextDouble();
        Double valor_total = salario + (vendas*0.15);
        System.out.printf("Funcionário(a): %s %nSalário final: %.2f", nome, valor_total);
        myScanner.close();
    }
}
