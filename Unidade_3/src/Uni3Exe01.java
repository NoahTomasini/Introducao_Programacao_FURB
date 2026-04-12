import java.util.Scanner;

public class Uni3Exe01 {
    private int larguraTerreno;
    private int comprimentoTerreno;

    public Uni3Exe01(int larguraTerreno, int comprimentoTerreno){
        this.larguraTerreno = larguraTerreno;
        this.comprimentoTerreno = comprimentoTerreno;
    }

    public int calcularArea(){
        return this.larguraTerreno * this.comprimentoTerreno;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int larguraTerreno, comprimentoTerreno;
        System.out.println("Digite a largura do terreno: ");
        larguraTerreno = myScanner.nextInt();
        System.out.println("Digite o comprimento do terreno: ");
        comprimentoTerreno = myScanner.nextInt();

        Uni3Exe01 objetoExe01 = new Uni3Exe01(larguraTerreno, comprimentoTerreno);
        int areaTerreno = objetoExe01.calcularArea();
        System.out.printf("A área do terreno é: %dm²", areaTerreno);
        myScanner.close();
    }
}
