import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário(a):");
        String nome = myScanner.nextLine();
        System.out.println("Digite o número de horas mensais trabalhadas (Ex:10,5) do funcionário(a):");
        Double horas = myScanner.nextDouble();
        System.out.println("Digite o número de dependentes do funcionário(a):");
        Integer dependentes = myScanner.nextInt();
        Double salario_bruto = horas*10.0 + dependentes*60.0;
        Double salario_liquido = salario_bruto - (salario_bruto*0.135);
        System.out.printf("Funcionário(a): %s;%nSalário Bruto: R$%.2f;%nSalário Líquido: R$%.2f", nome, salario_bruto, salario_liquido);
        myScanner.close();
    }
}
