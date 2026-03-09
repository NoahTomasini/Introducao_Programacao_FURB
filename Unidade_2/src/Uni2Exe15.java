import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        //O correspondente de resto de divisão em java é %=, o resultado será o resto da divisão do valor da esq. pelo da dir.
        //Ex: x = 10 > x %= 3 > x é 1 agora.
        Double valor = myScanner.nextDouble();
        Integer centavos_valor = (int)Math.round(valor * 100);
        //Transforma em centavos, arredonda o valor para não causar imprecisões pelo double
        
        Integer notas_100 = centavos_valor/10000;
        centavos_valor %= 10000;

        Integer notas_50 = centavos_valor/5000;
        centavos_valor %= 5000;

        Integer notas_20 = centavos_valor/2000;
        centavos_valor %= 2000;

        Integer notas_10 = centavos_valor/1000;
        centavos_valor %= 1000;

        Integer notas_5 = centavos_valor/500;
        centavos_valor %= 500;

        Integer notas_2 = centavos_valor/200;
        centavos_valor %= 200;

        Integer moedas_1 = centavos_valor/100;
        centavos_valor %= 100;

        Integer moedas_50 = centavos_valor/50;
        centavos_valor %= 50;
        
        Integer moedas_25 = centavos_valor/25;
        centavos_valor %= 25;

        Integer moedas_10 = centavos_valor/10;
        centavos_valor %= 10;

        Integer moedas_5 = centavos_valor/5;
        centavos_valor %= 5;

        Integer moedas_01 = centavos_valor;

        System.out.printf("O valor digitado %f, corresponde à:%n%d notas de 100;%n%d notas de 50;%n%d notas de 20;%n%d notas de 10;%n%d notas de 5;%n%d notas de 2;", valor, notas_100, notas_50, notas_20, notas_10, notas_5, notas_2);
        System.out.printf("%n%d moedas de 1;%n%d moedas de 0,50;%n%d moedas de 0,25;%n%d moedas de 0,10;%n%d moedas de 0,05;%n%d moedas de 0,01.", moedas_1, moedas_50, moedas_25, moedas_10, moedas_5, moedas_01);        
        myScanner.close();
    }
}
