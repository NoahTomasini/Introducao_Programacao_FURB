import java.util.Scanner;

public class Uni06Exe10 {
    private Scanner myScanner = new Scanner(System.in);
    private int[] vetor = new int[50];
    private int posicao_final = 0;
    public Uni06Exe10(){
        int opcao;
        do {
            System.out.println("\n\n------ Menu ------");
            System.out.println("1 - Incluir Valor");
            System.out.println("2 - Pesquisar Valor");
            System.out.println("3 - Alterar Valor");
            System.out.println("4 - Excluir Valor");
            System.out.println("5 - Mostrar Valor");
            System.out.println("6 - Ordenar Valor");
            System.out.println("7 - Inverter Valores");
            System.out.println("8 - Sair do Sistema");
            System.out.print("Digite a opção escolhida: ");
            opcao = myScanner.nextInt();
            
            switch (opcao) {
                case 1:
                    incluirValor();
                    break;
                case 2:
                    pesquisarValor();
                    break;
                case 3:
                    alterarValor();
                    break;
                case 4:
                    excluirValor();
                    break;
                case 5:
                    mostrarVetor();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Obrigado por utilizar o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;}
        } while(opcao != 8);
    }

    private void incluirValor(){
        if (posicao_final < 49){
            System.out.print("\nDigite o número a ser inserido: ");
            int numero = myScanner.nextInt();
            vetor[posicao_final] = numero;
            System.out.printf("Número %d inserido na posição %d de 50", numero, posicao_final+1);
            posicao_final ++;
        }
        else {
            System.out.println("Mémoria do vetor cheia.");
        }
    }

    private int pesquisarValor(){
        System.out.print("\nDigite o valor para pesquisa: ");
        int numero = myScanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < posicao_final; i++){
            if (vetor[i] == numero){
                System.out.printf("Número %d encontrado na posição %d de 50;", numero, i + 1);
                encontrado = true;
                return i;
            }
        }
        if (!encontrado){
            System.out.println("Número não encontrado;");
        }
        return -1;
    }

    private void alterarValor(){
        int posicao = pesquisarValor();
        if (posicao != -1){
            System.out.printf("%nDigite para qual número deseja alterar: ");
            int numero = myScanner.nextInt();
            vetor[posicao] = numero;
            System.out.printf("Número %d substituído na posição %d de 50;", numero, posicao + 1);
        }
    }

    private void excluirValor(){
        int posicao = pesquisarValor();
        if (posicao != -1){
            for (int i = posicao; i < posicao_final; i++){
                vetor[i] = vetor[i+1];
            }
            posicao_final--;
            System.out.println("\nValor excluído.");
        }
    }

    private void mostrarVetor(){
        for (int i = 0; i < posicao_final; i++){
            System.out.print("| ");
            System.out.print(vetor[i]);
            System.out.print(" | ");
        }
    }

    private void ordenarValores(){
        int bolha;
        for (int i = 0; i < posicao_final-1; i++){
            if(vetor[i] > vetor[i+1]){
                bolha = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = bolha;
                i = -1;
            }
        }
        System.out.println("Valores ordenados.");
        mostrarVetor();
    }

    private void inverterValores(){
        int temp = 0;
        for (int i = 0; i < posicao_final; i++){
            for (int j = 0; j < i; j++){
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        System.out.println("Valores invertidos.");
        mostrarVetor();
    }

    public static void main(String[] args) {
        new Uni06Exe10();
    }
}
