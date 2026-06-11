import java.util.Scanner;

public class Uni06Exe05 {
    Scanner myScanner = new Scanner(System.in);
    String[] pessoa = new String[5];
    String[] pessoa1 = new String[5];
    String[] pessoa2 = new String[5];
    public Uni06Exe05(String[] pessoa, String[] pessoa1, String[] pessoa2){
        this.pessoa = pessoa;
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
    }

    public void lerRespostas(){
        int verificador = 0;
        do{
        System.out.println("As seguintes perguntas devem ser respondidas com SIM, NAO ou IND (indiferente);");
        System.out.println("Você faz terapia?");
        String resposta = myScanner.next().toUpperCase();
        pessoa[0] = resposta;
        System.out.println("Você gosta de música nacional?");
        resposta = myScanner.next().toUpperCase();
        pessoa[1] = resposta;
        System.out.println("Você come carne?");
        resposta = myScanner.next().toUpperCase();
        pessoa[2] = resposta;
        System.out.println("Você gosta de ir para festas?");
        resposta = myScanner.next().toUpperCase();
        pessoa[3] = resposta;
        System.out.println("Você mora em Blumenau?");
        resposta = myScanner.next().toUpperCase();
        pessoa[4] = resposta;
        for(int i = 0; i<=4; i++){
            if(!(pessoa[i].equals("SIM") && pessoa[i].equals("NAO") && pessoa[i].equals("IND"))){
                verificador++;
            }
        }
        if(verificador!=0){
            System.out.println("Por favor, digite uma resposta válida;");
        }
    } while (verificador!=0);
    }
}