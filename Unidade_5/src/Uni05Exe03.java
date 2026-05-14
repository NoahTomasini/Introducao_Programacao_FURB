public class Uni05Exe03 {
    private int soma, numerador;

    public Uni05Exe03(int soma, int numerador){
        this.soma = soma;
        this.numerador = numerador;
    }

    public String somarFracoes(){
        for (int i = 1; i <= 100; i++){
            soma = soma + i;
            numerador = i;
        }
        
        return String.format("Soma das frações:%n%d/%d", numerador, soma);
    }

    public static void main(String[] args) {
        Uni05Exe03 objetoExe03 = new Uni05Exe03(0, 0);
        System.out.println(objetoExe03.somarFracoes());
    }
}
