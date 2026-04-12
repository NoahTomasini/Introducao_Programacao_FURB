import java.util.Scanner;

public class Uni4Exe11 {
    private int idade1, idade2, idade3;

    public Uni4Exe11(int idade1, int idade2, int idade3){
        this.idade1 = idade1;
        this.idade2 = idade2;
        this.idade3 = idade3;
    }

    public String classificarIrmaos(){
        if (idade1 == idade2 && idade1== idade3){ //trigêmeos
            return "TRIGÊMEOS";
        }
        else if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3){
            return "GÊMEOS";
        }
        else {
            return "APENAS IRMÃOS";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe11 objetoExe11 = new Uni4Exe11(0, 0, 0);
        System.out.println("Digite a idade do irmão 1:");
        objetoExe11.idade1 = myScanner.nextInt();
        System.out.println("Digite a idade do irmão 2:");
        objetoExe11.idade2 = myScanner.nextInt();
        System.out.println("Digite a idade do irmão 3:");
        objetoExe11.idade3 = myScanner.nextInt();
        System.out.println(objetoExe11.classificarIrmaos());
        myScanner.close();
    }
}
