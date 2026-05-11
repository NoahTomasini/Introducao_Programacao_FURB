import java.util.Scanner;

public class Uni4Exe16 {
    private int idade1_homem, idade2_homem, idade1_mulher, idade2_mulher;

    public Uni4Exe16(int idade1_homem, int idade1_mulher, int idade2_homem, int idade2_mulher){
        this.idade1_homem = idade1_homem;
        this.idade2_homem = idade2_homem;
        this.idade1_mulher = idade1_mulher;
        this.idade2_mulher = idade2_mulher;
    }

    public String compararIdades(){
        if (idade1_homem < idade2_homem && idade1_mulher < idade2_mulher){
            int soma = idade2_homem + idade1_mulher;
            int produto = idade1_homem * idade2_mulher;
            return String.format("Soma: %d\nProduto: %d", soma, produto);
        }
        else if (idade2_homem < idade1_homem && idade1_mulher < idade2_mulher){
            int soma = idade1_homem + idade1_mulher;
            int produto = idade2_homem * idade2_mulher;
            return String.format("Soma: %d\nProduto: %d", soma, produto);
        }
        else if (idade2_homem < idade1_homem && idade2_mulher < idade1_mulher){
            int soma = idade1_homem + idade2_mulher;
            int produto = idade2_homem * idade1_mulher;
            return String.format("Soma: %d\nProduto: %d", soma, produto);
        }
        else {
            int soma = idade1_homem + idade1_mulher;
            int produto = idade2_homem * idade2_mulher;
            return String.format("Soma: %d\nProduto: %d", soma, produto);
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe16 objetoExe16 = new Uni4Exe16(0, 0, 0, 0);
        System.out.println("Digite a idade do homem 1:");
        objetoExe16.idade1_homem = myScanner.nextInt();
        System.out.println("Digite a idade do homem 2:");
        objetoExe16.idade2_homem = myScanner.nextInt();
        System.out.println("Digite a idade da mulher 1:");
        objetoExe16.idade1_mulher = myScanner.nextInt();
        System.out.println("Digite a idade da mulher 2:");
        objetoExe16.idade2_mulher = myScanner.nextInt();
        System.out.println(objetoExe16.compararIdades());
        myScanner.close();
    }
}
