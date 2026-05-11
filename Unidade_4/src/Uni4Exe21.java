import java.util.Scanner;

public class Uni4Exe21 {
    private double massa, altura;

    public Uni4Exe21(double massa, double altura){
        this.massa = massa;
        this.altura = altura;
    }

    public String calcularIMC(){
        double imc = massa/Math.pow(altura, 2);
        if (imc<18.5){
            return "Magreza";
        }
        else if (imc>=18.5 && imc<24.9){
            return "Saudável";
        }
        else if (imc>=24.9 && imc<29.9){
            return "Sobrepeso";
        }
        else if (imc>=29.9 && imc<34.9){
            return "Obesidade grau I";
        }
        else if (imc>=34.9 && imc<39.9){
            return "Obesidade grau II (severa)";
        }
        else {
            return "Obesidade grau III (mórbida)";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe21 objetoExe21 = new Uni4Exe21(0, 0);
        System.out.println("Digite a massa:");
        objetoExe21.massa = myScanner.nextDouble();
        System.out.println("Digite a altura:");
        objetoExe21.altura = myScanner.nextDouble();
        System.out.println(objetoExe21.calcularIMC());
        myScanner.close();
    }
}
