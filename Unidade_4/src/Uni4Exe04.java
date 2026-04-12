import java.util.Scanner;

public class Uni4Exe04 {
    private double numero;
    
    public Uni4Exe04(double numero){
        this.numero = numero;
    }

    public String verificarDecimal(){
        if (numero % 1 == 0){
            return "Casas decimais não foram digitadas";
        }
        else {
            return "Casas decimais foram digitadas";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe04 objetoExe04 =  new Uni4Exe04(0);
        System.out.println("Digite um número positivo:");
        objetoExe04.numero = myScanner.nextDouble();
        System.out.println(objetoExe04.verificarDecimal());
        myScanner.close();
    }
}
