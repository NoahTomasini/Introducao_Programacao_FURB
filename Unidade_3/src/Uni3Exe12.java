import java.util.Scanner;

public class Uni3Exe12 {
    private String nome;
    private Double horasTrabalhadas, numeroDependentes;

    public Uni3Exe12(String nome, Double horasTrabalhadas, Double numeroDependentes){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.numeroDependentes = numeroDependentes;
    }

    public Double calcularSalarioTrabalho(){
        return horasTrabalhadas * 10d;
    }

    public Double calcularSalarioFamilia(){
        return numeroDependentes * 60d;
    }

    public Double calcularSalarioBruto(){
        return  calcularSalarioTrabalho() + calcularSalarioFamilia();
    }

    public Double calcularDescontoTrabalho(){
        return calcularSalarioTrabalho() * 0.135d;
    }

    public Double calcularSalarioLiquido(){
        return calcularSalarioBruto() - calcularDescontoTrabalho();
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = myScanner.nextLine();
        System.out.println("Digite as horas trabalhadas do funcionário: ");
        Double horasTrabalhadas = myScanner.nextDouble();
        System.out.println("Digite o numero de dependentes do funcionário: ");
        Double numeroDependentes = myScanner.nextDouble();
        Uni3Exe12 objetoExe12 = new Uni3Exe12(nome, horasTrabalhadas, numeroDependentes);

        System.out.printf("O funcionário %s possui um salário bruto de %.2f reais e um salário líquido de %.2f reais.", nome, objetoExe12.calcularSalarioBruto(), objetoExe12.calcularSalarioLiquido());
        myScanner.close();
    }
}
