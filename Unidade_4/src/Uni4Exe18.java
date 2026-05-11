import java.util.Scanner;

public class Uni4Exe18 {
    private int pagamento;
    private double valor;

    public Uni4Exe18(int pagamento, double valor){
        this.pagamento = pagamento;
        this.valor = valor;
    }

    public String verificarPagamento(){
        if (pagamento <= 10){
            double valor_total = valor - (valor*0.10);
            return String.format("O pagamento está em dia. Valor da prestação: R$%.2f", valor_total);
        }
        else if (pagamento <= 15){
            return String.format("O pagamento está em dia. Valor da prestação: R$%.2f", valor);
        }
        else {
            double valor_total = valor + (valor*0.02*(pagamento-10));
            return String.format("O pagamento está atrasado. Multa de 2%% por dia de atraso. Valor da prestação: R$%.2f", valor_total);
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe18 objetoExe18 = new Uni4Exe18(0, 0);
        System.out.println("Digite o dia do pagamento:");
        objetoExe18.pagamento =  myScanner.nextInt();
        System.out.println("Digite o valor do pagamento:");
        objetoExe18.valor =  myScanner.nextDouble();
        System.out.println(objetoExe18.verificarPagamento());
        myScanner.close();
    }
}
