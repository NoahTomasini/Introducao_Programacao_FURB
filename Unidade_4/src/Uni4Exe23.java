import java.util.Scanner;

public class Uni4Exe23 {
    private int mes;

    public Uni4Exe23(int mes){
        this.mes = mes;
    }

    public String informarMes(){
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês inexistente";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe23 objetoExe23 = new Uni4Exe23(0);
        System.out.println("Digite o mês em numeral:");
        objetoExe23.mes = myScanner.nextInt();
        System.out.println(objetoExe23.informarMes());
        myScanner.close();
    }
}
