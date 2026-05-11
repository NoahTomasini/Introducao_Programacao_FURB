import java.util.Scanner;

public class Uni4Exe15 {
    private int quant_mes;

    public Uni4Exe15(int quant_mes){
        this.quant_mes = quant_mes;
    }

    public String reajustarSalario(){
        if (quant_mes <= 12){
            return "O funcionário irá receber 5% de reajuste";
        }
        else if (quant_mes >= 13 && quant_mes <= 48){
            return "O funcionário irá receber 7% de reajuste";
        }
        else {
            return "Reajuste não informado";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe15 objetoExe15 = new Uni4Exe15(0);
        System.out.println("Há quantos meses o funcionário foi admitido?");
        objetoExe15.quant_mes = myScanner.nextInt();
        System.out.println(objetoExe15.reajustarSalario());
        myScanner.close();
    }
}
