import java.util.Scanner;

public class Uni4Exe10 {
    private int idadeM, idadeZ, idadeL;

    public Uni4Exe10(int idadeM, int idadeZ, int idadeL){
        this.idadeM = idadeM;
        this.idadeZ = idadeZ;
        this.idadeL = idadeL; 
    }

    public String descobrirCacula(){
        if (idadeM < idadeZ && idadeM < idadeL){
            return "O Marquinhos é o caçula.";
        }
        else if (idadeZ < idadeM && idadeZ < idadeL){
            return "O Zézinho é o caçula.";
        }

        else {
            return "A Luluzinha é a caçula.";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe10 objetoExe10 = new Uni4Exe10(0, 0, 0);
        System.out.println("Digite a idade do Zézinho:");
        objetoExe10.idadeZ = myScanner.nextInt();
        System.out.println("Digite a idade do Marquinhos:");
        objetoExe10.idadeM = myScanner.nextInt();
        System.out.println("Digite a idade da Luluzinha:");
        objetoExe10.idadeL = myScanner.nextInt();
        System.out.println(objetoExe10.descobrirCacula());
        myScanner.close();
    }
}
