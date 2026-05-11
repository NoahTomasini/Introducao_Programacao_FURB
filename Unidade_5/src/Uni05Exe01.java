import java.util.Scanner;

public class Uni05Exe01 {
    private int numero;

    public Uni05Exe01(int numero){
        this.numero = numero;
    }

    public String definirParidade(){
        if(numero % 2 != 0){
            return String.format("O número %d é ímpar.", numero);
        }
        else{
            return String.format("O número %d é par.", numero);
        }
    }

    public static void main(String[] args) {
        //(condição 1 = execução 1 vez antes do código)
        //(2 = define a condição para execução)
        //(3 = é executada sempre após a execução do code)
        //for (1;2;3)
        Uni05Exe01 objetoExe01 = new Uni05Exe01(0);
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < 20; i ++){
            System.out.println("Digite um número para conferir sua paridade:");
            objetoExe01.numero = myScanner.nextInt();
            System.out.println(objetoExe01.definirParidade());
        }
        myScanner.close();
    }
}

