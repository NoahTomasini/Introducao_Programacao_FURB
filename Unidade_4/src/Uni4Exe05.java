import java.util.Scanner;

public class Uni4Exe05 {
    private boolean resposta;

    public Uni4Exe05(boolean resposta){
        this.resposta = resposta;
    }

    public String responderPergunta(){
        if (resposta == true){
            return "Sim";
        }
        else{
            return "Não";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe05 objetoExe05 = new Uni4Exe05(false);
        System.out.println("A cor é azul?\ntrue or false.");
        objetoExe05.resposta = myScanner.nextBoolean();
        System.out.println(objetoExe05.responderPergunta());
        myScanner.close();
    }
}
