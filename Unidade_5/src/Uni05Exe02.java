public class Uni05Exe02 {
    private int soma_par, soma_impar;

    public Uni05Exe02(int soma_impar, int soma_par){
        this.soma_impar = soma_impar;
        this.soma_par = soma_par;
    }

    public String somarPareImpar(){
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                soma_par = soma_par + i;
            }
            else {
                soma_impar = soma_impar + i;
            }
        }
        return String.format("Soma dos números pares: %d%nSoma dos número ímpares: %d", soma_par, soma_impar);
    }

    public static void main(String[] args) {
        Uni05Exe02 objetoExe02 = new Uni05Exe02(0, 0);
        System.out.println(objetoExe02.somarPareImpar());
    }
}
