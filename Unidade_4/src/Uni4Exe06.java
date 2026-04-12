import java.util.Scanner;

public class Uni4Exe06 {
    private char caractere;
    
    public Uni4Exe06(char caractere){
        this.caractere = caractere;
    }

    public String lerGenero(){
        if (caractere == 'M'){
            return "Masculino";
        }
        else if (caractere == 'F'){
            return "Feminino";
        }
        else if (caractere == 'I'){
            return "Não Informado";
        }
        else {
            return "Entrada Incorreta";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe06 objetoExe06 = new Uni4Exe06('0');
        System.out.println("Informe o gênero:\nM - Masculino\nF -" +
        "Feminino\nI - Não Informado");
        objetoExe06.caractere = Character.toUpperCase(myScanner.next().charAt(0));
        System.out.println(objetoExe06.lerGenero());
        myScanner.close();
    }
}
