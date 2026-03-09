import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a duração em segundos para conversão:");
        Integer tempo = myScanner.nextInt();
        Integer horas = tempo/3600;
        Integer minutos = (tempo - horas*3600)/60;
        Integer segundos = ((tempo - horas*3600)- minutos*60);
        System.out.printf("A duração total é de: %d:%d:%d", horas, minutos, segundos);
        myScanner.close();
    }
}
