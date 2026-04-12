import java.util.Scanner;

public class Uni3Exe14 {
    private float distancia;
    private float tempo;

    public Uni3Exe14(float distancia, float tempo){
        this.distancia = distancia;
        this.tempo = tempo;
    }

    public float descobrirVelocidadeMedia(){
        return distancia / tempo;
    }

    public float descobrirCombustivelGasto(){
        return distancia / 12f;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida: ");
        float distancia = myScanner.nextFloat();
        System.out.println("Digite o tempo que levou para percorrer ela:");
        float tempo = myScanner.nextFloat();

        Uni3Exe14 objetoExe14 = new Uni3Exe14(distancia, tempo);

        System.out.println("Velocidade média é "+ objetoExe14.descobrirVelocidadeMedia()+ "km/h e a quantidade de combustível gasto foi de "+ objetoExe14.descobrirCombustivelGasto() +" litros.");
        myScanner.close();
    }
}
