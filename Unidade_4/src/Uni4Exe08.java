import java.util.Scanner;

public class Uni4Exe08 {
    private char letra;

    public Uni4Exe08(char letra){
        this.letra = letra;
    }

    public String verificarVogal(){
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            return "É vogal.";
        }
        else {
            return "É consoante.";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe08 objetoExe08 = new Uni4Exe08('0');
        System.out.println("Informe a letra:");
        objetoExe08.letra = Character.toLowerCase(myScanner.next().charAt(0));
        System.out.println(objetoExe08.verificarVogal());
        myScanner.close();
    }
}