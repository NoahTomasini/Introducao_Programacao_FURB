import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int nota1 = myObj.nextInt();
        System.out.print("Digite a segunda nota: ");
        int nota2 = myObj.nextInt();
        System.out.print("Digite a terceira nota: ");
        int nota3 = myObj.nextInt();
        double media = (nota1+nota2+nota3)/3.0; //'3.0' para forçar as casas decimais no resultado
        System.out.printf("Média=%.2f", media); //% representa a váriavel dentro da str
        //printf significa que há formatação na string
        myObj.close();
    }
}
