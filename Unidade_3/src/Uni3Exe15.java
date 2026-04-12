import java.util.Scanner;

public class Uni3Exe15 {
    private int numero;

    public Uni3Exe15(int numero) {
        this.numero = numero;
    }

    public int centena() {
        return this.numero / 100;
    }

    public int dezena() {
        return (this.numero % 100) / 10;
    }

    public int unidade() {
        return this.numero % 10;
    }

    public void mostrar() {
        System.out.println(centena() + " centena(s)  "
                + dezena() + " dezena(s)  "
                + unidade() + " unidade(s)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor de três dígitos:");
        int numero = sc.nextInt();
        Uni3Exe15 exe15 = new Uni3Exe15(numero);
        exe15.mostrar();
        sc.close();
    }
}
