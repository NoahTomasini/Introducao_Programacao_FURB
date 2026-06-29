import java.util.Scanner;
public class Liga4 {
    Scanner myScanner = new Scanner(System.in);
    //mapeamento [0][0] - [6][7]
    char tabuleiro[][];
    //C-computador, J-jogador, vencerJogo encerra a partida
    int linhaC, colunaC, linhaJ, colunaJ, vencerJogo;
    char corC, corJ;

    public Liga4(int vencerJogo, int linhaC, int colunaC, int linhaJ, int colunaJ, char[][] tabuleiro, char corC, char corJ){
        this.linhaC = linhaC;
        this.colunaC = colunaC;
        this.linhaJ = linhaJ;
        this.colunaJ = colunaJ;
        this.tabuleiro = tabuleiro;
        this.corC = corC;
        this.corJ = corJ;
        this.vencerJogo = vencerJogo;
        int opcao;
        do {
            System.out.println("\n\n------ Menu ------");
            System.out.println("1 - Iniciar partida");
            System.out.println("2 - Sair do Sistema");
            System.out.print("Digite a opção escolhida: ");
            opcao = myScanner.nextInt();
            
            switch (opcao){
                case 1:
                    jogarPartida();
                    break;
                case 2:
                    System.out.println("Obrigado por jogar conosco!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;}
        } while(opcao != 2);
    }

    public void criarTabuleiro(){
        for(int linha = 0; linha < 6; linha++){
            for(int coluna = 0; coluna < 7; coluna++){
                tabuleiro[linha][coluna] = 'B';
            }
        }
        vencerJogo = 0;
    }

    public void jogarPartida(){
        criarTabuleiro();
        escolherCor();
        do{
            fazerJogada();
        }while(vencerJogo==0);
        criarTabuleiro();
    }

    public void mostrarTabuleiro(){
        System.out.println('\n');
        System.out.println("1 2 3 4 5 6 7");
        for(int linha = 0; linha < 6; linha++){
            for(int coluna = 0; coluna < 7; coluna++){
                System.out.printf("%s ",tabuleiro[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println('\n');
    }

    public void escolherCor(){
        int verificar = 0;
        String cor_verificar;
        do{
            System.out.println("Com qual cor você deseja jogar?\nV - Vermelho;\nA - Azul;");
            cor_verificar = myScanner.next().toUpperCase();
            if(!cor_verificar.equals("V") && !cor_verificar.equals("A")){
                System.out.println("Por favor, escolha entre V ou A;");
            }
            else{
                verificar++;
            }
        } while(verificar==0);
        corJ = cor_verificar.charAt(0);
        if(corJ == 'V'){
            corC = 'A';
        }
        else{
            corC = 'V';
        }
        System.out.println("Boa sorte! Lembre-se, você é representado pela letra "+ corJ +";");
    }

    public void descobrirLinha(){
        int verificar = 0;
        for (int linha = 5; verificar == 0; linha--){
            if(tabuleiro[linha][colunaJ] == 'B'){
                linhaJ = linha;
                verificar++;
            }
            else if(linha == 0 && verificar == 0){
                linhaJ = -1;
                linha = -1;
                verificar++;
            }
        }
    }
    public void jogadaComputador(){
        int min = 0;
        int max = 6;
        int range = max - min + 1;
        int verificar;
        do{
            verificar = 0;
            colunaC = (int)(Math.random() * range);
            if(verificar==0){
                for (int linha = 5; verificar == 0 && linha <= 0; linha--){
                    if(tabuleiro[linha][colunaC] == 'B'){
                        linhaC = linha;
                        verificar++;
                    }
                }
            }
        }while(verificar==0);
        tabuleiro[linhaC][colunaC] = corC;
        verificarComputadorLiga4();
        declararEmpate();
    }

    public void fazerJogada(){
        int verificar;
        int coluna;
        do{
            verificar = 0;
            mostrarTabuleiro();
            System.out.println("Para inserir a sua jogada, digite o número indicando a coluna escolhida;");
            try{
                coluna = myScanner.nextInt();
                if(coluna >= 1 && coluna <= 7){
                    colunaJ = coluna - 1;
                    verificar++;
                }

                if(verificar!=0){
                    descobrirLinha();
                    if(linhaJ==-1){
                        System.out.println("Todas as linhas dessa coluna foram preenchidas, tente escolher outra;");
                        verificar = 0;
                    }
                }

                else if(verificar==0){
                    System.out.println("Por favor, digite uma jogada válida;");
                }
            }
            catch(Exception notInt){
                System.out.println("Por favor, digite uma jogada válida;");
                coluna = -1;
                myScanner.next();
                continue;
            }
            
        }while(verificar==0);
        tabuleiro[linhaJ][colunaJ] = corJ;
        verificarJogadorLiga4();
        declararEmpate();
    }

    public void verificarComputadorLiga4(){
        //vertical
        int contador = 0;
        for (int linha = linhaC; linha <= 5; linha++){
            if(tabuleiro[linha][colunaC]==corC){
                contador++;
            }
            else{
                break;
            }
        }
        //vitoria
        if(contador==4){
            vencerJogo = 1;
            mostrarTabuleiro();
            System.out.println("O computador venceu, tente novamente.");
            return;
        }
        //horizontal
        //esquerda
        contador = 1;
        int coluna = colunaC - 1;
        while(coluna >= 0 && tabuleiro[linhaC][coluna] == corC){
            contador++;
            coluna--;
        }
        //direita
        coluna = colunaC + 1;
        while(coluna < 7 && tabuleiro[linhaC][coluna] == corC){
            contador++;
            coluna++;
        }
        if(contador == 4){
            vencerJogo = 1;
            mostrarTabuleiro();
            System.out.println("O computador venceu, tente novamente.");
            return;
        }
        
        //diagonal
        //esquerda
        //cima-esquerda
        contador = 1;
        int linha;
        linha = linhaC - 1;
        coluna = colunaC - 1;
        while(linha >= 0 && coluna >= 0 && tabuleiro[linha][coluna] == corC){
            contador++;
            linha--;
            coluna--;
        }

        //baixo-direita
        linha = linhaC + 1;
        coluna = colunaC + 1;
        while(linha < 6 && coluna < 7 && tabuleiro[linha][coluna] == corC){
            contador++;
            linha++;
            coluna++;
        }

        contador = 1;
        //direita
        //cima-direita
        linha = linhaC - 1;
        coluna = colunaC + 1;
        while(linha >= 0 && coluna < 7 && tabuleiro[linha][coluna] == corC){
            contador++;
            linha--;
            coluna++;
        }

        //baixo-esquerda
        linha = linhaC + 1;
        coluna = colunaC - 1;
        while(linha < 6 && coluna >= 0 && tabuleiro[linha][coluna] == corC){
            contador++;
            linha++;
            coluna--;
        }

        if(contador >= 4){
            vencerJogo = 1;
            mostrarTabuleiro();
            System.out.println("O computador venceu, tente novamente.");
            return;
        }

        else{
            System.out.println("O computador jogou.");
        }
    }

    public void verificarJogadorLiga4(){
        //vertical
        int contador = 0;
        for (int linha = linhaJ; linha <= 5; linha++){
            if(tabuleiro[linha][colunaJ]==corJ){
                contador++;
            }
            else{
                break;
            }
        }
        //vitoria
        if(contador==4){
            vencerJogo = 1;
            mostrarTabuleiro();
            System.out.println("Você venceu!");
            return;
        }
        //horizontal
        //esquerda
        contador = 1;
        int coluna = colunaJ - 1;
        while(coluna >= 0 && tabuleiro[linhaJ][coluna] == corJ){
            contador++;
            coluna--;
        }
        //direita
        coluna = colunaJ + 1;
        while(coluna < 7 && tabuleiro[linhaJ][coluna] == corJ){
            contador++;
            coluna++;
        }
        if(contador == 4){
            vencerJogo = 1;
            mostrarTabuleiro();
            System.out.println("Você venceu!");
            return;
        }
        
        //diagonal
        //esquerda
        //cima-esquerda
        contador = 1;
        int linha = linhaJ - 1;
        coluna = colunaJ - 1;
        while(linha >= 0 && coluna >= 0 && tabuleiro[linha][coluna] == corJ){
            contador++;
            linha--;
            coluna--;
        }

        //baixo-direita
        linha = linhaJ + 1;
        coluna = colunaJ + 1;
        while(linha < 6 && coluna < 7 && tabuleiro[linha][coluna] == corJ){
            contador++;
            linha++;
            coluna++;
        }

        contador = 1;
        //direita
        //cima-direita
        linha = linhaJ - 1;
        coluna = colunaJ + 1;
        while(linha >= 0 && coluna < 7 && tabuleiro[linha][coluna] == corJ){
            contador++;
            linha--;
            coluna++;
        }

        //baixo-esquerda
        linha = linhaJ + 1;
        coluna = colunaJ - 1;
        while(linha < 6 && coluna >= 0 && tabuleiro[linha][coluna] == corJ){
            contador++;
            linha++;
            coluna--;
        }

        if(contador >= 4){
            vencerJogo = 1;
            mostrarTabuleiro();
            System.out.println("Você venceu!");
            return;
        }

        else {
            jogadaComputador();
        }
    }

    public void declararEmpate(){
        for (int coluna = 0; coluna < 7; coluna++){
            if (tabuleiro[5][coluna] == 'B'){
                return;
            }
        }
        System.out.println("Empate! O tabuleiro está cheio.");
    }

    public static void main(String[] args){
        new Liga4(0, 0, 0, 0, 0, new char[6][7], 'B', 'B');
    }
}