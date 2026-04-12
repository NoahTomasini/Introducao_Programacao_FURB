import java.util.Scanner;

public class Uni3Exe16 {
    private int valorTotal;
    private int valorpago;

    public Uni3Exe16(int valorTotal, int valorpago){
        this.valorTotal = valorTotal;
        this.valorpago = valorpago;}

        public int troco() {
           return this.valorpago - this.valorTotal;
        }

        public int notasdeCem (){
            return troco() / 100;
        }

        public int notasdeDez(){
            return (troco() %100) / 10;
        }

        public int notasdeum(){
            return troco() %10;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("valor total da compra");
            int valorTotal = sc.nextInt();
            System.out.println("valor total dado pelo cliente");
            int valorpago = sc.nextInt();

            Uni3Exe16 exe16 = new Uni3Exe16(valorTotal, valorpago);
            int totalNotas = exe16.notasdeCem( ) + exe16.notasdeDez();  exe16.notasdeum();

            System.out.println("o numero minimo de notas de troco é " + totalNotas);
            System.out.println("quantidades de notas necessarias " + exe16.notasdeCem());
            System.out.println("quantidades de notas de dez " + exe16.notasdeDez());
            System.out.println("quantidaded de notas de um: " + exe16.notasdeum());
            sc.close();
        }
}
