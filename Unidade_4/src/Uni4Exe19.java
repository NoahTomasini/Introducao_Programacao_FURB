import java.util.Scanner;

public class Uni4Exe19 {
    private int x, y;

    public Uni4Exe19(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String definirQuadrante(){
        if (x == 0 && y == 0){
            return "Quadrante zero";
        }
        else if (x>0&&y>0){
            return "Primeiro quadrante";
        }
        else if (x<0&&y>0){
            return "Segundo quadrante";
        }
        else if (x<0&&y<0){
            return "Terceiro quadrante";
        }
        else {
            return "Quarto quadrante";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe19 objetoExe19 = new Uni4Exe19(0, 0);
        System.out.println("Digite o X:");
        objetoExe19.x = myScanner.nextInt();
        System.out.println("Digite o Y:");
        objetoExe19.y = myScanner.nextInt();
        System.out.println(objetoExe19.definirQuadrante());
        myScanner.close();
    }
}
