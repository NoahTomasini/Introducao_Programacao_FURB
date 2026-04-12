import java.util.Scanner;
import java.util.Arrays;

public class Uni4Exe14 {
    private int dia, mes, ano;

    public Uni4Exe14(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String validarData(){
        //validando meses e ano
        if (mes >= 1 && mes <= 12 && ano > 0){
            //meses com 31 dias
            if (Arrays.asList(1,3,5,7,8,10,12).contains(mes)){
                if (dia >= 1 && dia <= 31){
                    return "Válida";}
                else {
                    return "Não válida";}}
            //meses com 30 dias
            else if (Arrays.asList(4,6,9,11).contains(mes)){
                if (dia >= 1 && dia <= 30){
                    return "Válida";}
                else {
                    return "Não válida";}}
            //fevereiro
            else if (mes == 2){
                //anos bissextos
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0 && ano % 400 == 0)){
                    if (dia >= 1 && dia <= 29){
                        return "Válida";}
                    else {
                        return "Não válida";}}
                //anos normais
                else if (dia >= 1 && dia <= 28){
                    return "Válida";}
                else {
                    return "Não válida";}}
            else {
                return "Não válida";}}
        else {
            return "Não válida";}
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Uni4Exe14 objetoExe14 = new Uni4Exe14(0, 0, 0);
        System.out.println("Digite o dia:");
        objetoExe14.dia = myScanner.nextInt();
        System.out.println("Digite o mes:");
        objetoExe14.mes = myScanner.nextInt();
        System.out.println("Digite o ano:");
        objetoExe14.ano = myScanner.nextInt();
        System.out.println(objetoExe14.validarData());
        myScanner.close();
    }
}
