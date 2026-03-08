import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        Integer valor = myScanner.nextInt();
        Integer notas_100 = valor/100;
        Integer notas_50 = (valor - (notas_100*100))/50;
        Integer notas_20 = (valor - (notas_100*100) - (notas_50*50))/20;
        Integer notas_10 = (valor - (notas_100*100) - (notas_50*50) - (notas_20*20))/10;
        Integer notas_5 = (valor - (notas_100*100) - (notas_50*50) - (notas_20*20) - (notas_10*10))/5;
        Integer notas_2 = (valor - (notas_100*100) - (notas_50*50) - (notas_20*20) - (notas_10*10) - (notas_5*5))/2;
        Integer notas_1 = (valor - (notas_100*100) - (notas_50*50) - (notas_20*20) - (notas_10*10) - (notas_5*5) - (notas_2*2))/1;
        System.out.printf("O valor digitado %d, corresponde à:%n%d notas de 100;%n%d notas de 50;%n%d notas de 20;%n%d notas de 10;%n%d notas de 5;%n%d notas de 2;%n%d moedas de 1.", valor, notas_100, notas_50, notas_20, notas_10, notas_5, notas_2, notas_1);
        myScanner.close();
    }
}
