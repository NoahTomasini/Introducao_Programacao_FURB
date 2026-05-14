public class Uni05Exe04 {
    private int numerador, denominador;

    public Uni05Exe04(int numerador, int denominador){
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public String somarFracoes(){
        int contador, i;    
        numerador = 1;
        denominador = 0;
        for (contador = 1, i = 2; contador <= 20; contador++, i = i + 2){
            numerador = numerador + 2;
            denominador = denominador + i;
        }
        return String.format("O valor de S é: %d/%d", numerador, denominador);
    }

    
    public static void main(String[] args) {
        Uni05Exe04 objetoExe04 = new Uni05Exe04(0, 0);
        System.out.println(objetoExe04.somarFracoes());
    }
}
