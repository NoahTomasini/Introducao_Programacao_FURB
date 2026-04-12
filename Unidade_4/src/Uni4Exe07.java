import java.util.Scanner;

public class Uni4Exe07 {
    private float peso;

    public Uni4Exe07(float peso){
        this.peso = peso;
    }

    public float calcularPreco(){
        if (peso <= 50){
            return 0.45f;
        }
        else {
            float pesoExtra = peso - 50; //tira a quantidade máxima do preço base
            float valorAdicional = (pesoExtra/20) + 1;
            float valor = 0.45f + 0.45f * (valorAdicional);
            return valor;
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe07 objetoExe07 = new Uni4Exe07(0);
        System.out.println("Digite o peso da carta:");
        objetoExe07.peso = myScanner.nextFloat();
        System.out.printf("Custo do selo: R$%.2f", objetoExe07.calcularPreco());
        myScanner.close();
    }
}
