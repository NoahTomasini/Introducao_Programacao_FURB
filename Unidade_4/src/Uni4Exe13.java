import java.util.Scanner;

public class Uni4Exe13 {
    private int carta1, carta2, carta3;

    public Uni4Exe13(int carta1, int carta2, int carta3){
        this.carta1 = carta1;
        this.carta2 = carta2;
        this.carta3 = carta3;
    }

    public String trucar(){
        int cartas_altas = 0;
        if (carta1 == 1 || carta1 == 2 || carta3 == 3){
            cartas_altas +=1;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3){
            cartas_altas +=1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3){
            cartas_altas +=1;
        }
        if (cartas_altas == 3){
            return "NOVE";
        }
        else if (cartas_altas == 2){
            return "SEIS";
        }
        else if(cartas_altas == 1){
            return "TRUCO";
        }
        else {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe13 objetoExe13 = new Uni4Exe13(0, 0, 0);
        System.out.println("Digite a carta 1:");
        objetoExe13.carta1 = myScanner.nextInt();
        System.out.println("Digite a carta 2:");
        objetoExe13.carta2 = myScanner.nextInt();
        System.out.println("Digite a carta 3:");
        objetoExe13.carta3 = myScanner.nextInt();
        System.out.println(objetoExe13.trucar());
        myScanner.close();
    }
}
