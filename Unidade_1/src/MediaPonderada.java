import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String entrada = "inicialvalue";
        Double somaNotasPonderadas = 0.0d;
        Double somaPesos = 0.0d;
        while (entrada != null) {
            System.out.println("Para finalizar o cálculo, clique enter invés da primeira nota");
            System.out.println("Digite a nota:");
            entrada = myScanner.nextLine();
            if (entrada.isEmpty()) {
                break;
            }
            Double nota = Double.parseDouble(entrada);
            System.out.println("Digite o peso dessa nota:");
            Double peso = Double.parseDouble(myScanner.nextLine());
            somaNotasPonderadas += nota * peso;
            somaPesos += peso;
        }
        Double mediaPonderada = somaNotasPonderadas / somaPesos;
        System.out.printf("Média ponderada=%.2f", mediaPonderada);
        myScanner.close();
    }
}
