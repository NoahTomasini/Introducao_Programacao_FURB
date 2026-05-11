import java.util.Scanner;

public class Uni4Exe20 {
    private double prova1, prova2, prova3, exercicios;

    public Uni4Exe20(double prova1, double prova2, double prova3, double exercicios){
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.prova3 = prova3;
        this.exercicios = exercicios;
    }

    public String calcularMedia(){
        double media = (prova1+prova2*2+prova3*3+exercicios)/7;
        if (media >= 9.0){
            return String.format("A média de aproveitamento foi de: %.2f. Conceito: A. Aprovado.", media);
        }
        else if (media >= 7.5){
            return String.format("A média de aproveitamento foi de: %.2f. Conceito: B. Aprovado.", media);
        }
        else if (media >= 6.0){
            return String.format("A média de aproveitamento foi de: %.2f. Conceito: C. Aprovado.", media);
        }
        else if (media >= 4.0){
            return String.format("A média de aproveitamento foi de: %.2f. Conceito: D. Reprovado.", media);
        }
        else {
            return String.format("A média de aproveitamento foi de: %.2f. Conceito: E. Reprovado.", media);
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe20 objetoExe20 = new Uni4Exe20(0, 0, 0, 0);
        System.out.println("Digite a nota da prova 1:");
        objetoExe20.prova1 = myScanner.nextDouble();
        System.out.println("Digite a nota da prova 2:");
        objetoExe20.prova2 = myScanner.nextDouble();
        System.out.println("Digite a nota da prova 3:");
        objetoExe20.prova3 = myScanner.nextDouble();
        System.out.println("Digite a nota dos exercícios:");
        objetoExe20.exercicios = myScanner.nextDouble();
        System.out.println(objetoExe20.calcularMedia());
        myScanner.close();
    }
}
