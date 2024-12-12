package Desafios;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio03 {
    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static String[][] matrizCadastro = {{"",""}}; //inicializando para nao ter problema no codigo | utilizando aspas para ser string

    static File arquivoBancoDeDados = new File(System.getProperty("user.home"), "bancoDeDados.txt"); //pede para a JVM que pegue o caminho para a pasta do usuário

    public static void main(String[] args) {
        carregarDadosDoArquivo();
        matrizCadastro[0] = cabecalho;


        String menu = """
                --------------------------------------
                |   Escolha uma opção:               |
                |      1- Exibir Cadatro Completo    |
                |      2- Inserir novo usuário       |
                |      3- Atualizar cadastro por id  |
                |      4- Deletar cadastro por id    |
                |      5- Sair                       |
                |------------------------------------|
                """;
        int opcao;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuarios();
                    break;
                case 2:
                    cadastrarUsuarios();
                    break;
                case 3:
                    atualizarUsuarios();
                    break;
                case 4:
                    deletarUsuarios();
                    break;
                case 5:
                    System.out.println("Fim de Programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);
    }

    public static void exibirUsuarios() {
        StringBuilder tabela = new StringBuilder();
        for (String[] linha : matrizCadastro) { //Matriz de String
            for (int coluna = 0; coluna < matrizCadastro[0].length; coluna++) {
                int tamanhoColuna = coluna == 0 ? 5 : (coluna == 2 ? 12 : 25); //define a quantidade de caracteres de cada coluna.
                tabela.append(String.format("%-" + tamanhoColuna + "s |  ", linha[coluna]));
            }
            tabela.append("\n");
        }
        System.out.println(tabela);


    }

    public static void cadastrarUsuarios() {

        System.out.print("Quantas pessoas você deseja cadastrar?");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[matrizCadastro.length + qtdPessoas][cabecalho.length]; //pegar a matriz global e ver quantas pessoas tem e aumentar a matriz
        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);   //o "Arrays" é uma classe com varias ferramentas, o "Arrays.copyOf" pega a matriz inteira e copia
        }
        System.out.println("Preencha as informaçoes a seguir");
        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println(cabecalho[0] + " - " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); //converte numero para string

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.nextLine();
            }
        }
        matrizCadastro = novaMatriz;
        salvarDadosNoArquivo();
    }

    public static void deletarUsuarios() {
        System.out.println("Escolha o ID do usuário que deseja deletar: ");
        int idEscolha = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length - 1][cabecalho.length];
        novaMatriz[0] = cabecalho;
        for (int linha = 1, idNovaMatriz = 1; linha < matrizCadastro.length; linha++) {
            if (linha == idEscolha) {
                continue; // faz pular a linha do idEscolhido e não copiar ela
            }
            novaMatriz[idNovaMatriz] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
            novaMatriz[idNovaMatriz][0] = String.valueOf(idNovaMatriz);
            idNovaMatriz++;
        }
        matrizCadastro = novaMatriz;
        System.out.println("Usuário deletado com sucesso!");
        exibirUsuarios();
        salvarDadosNoArquivo();
    }


    public static void salvarDadosNoArquivo() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoBancoDeDados))){
            for (String[] linha : matrizCadastro) {
                bufferedWriter.write(String.join(",", linha) + "\n");
            }

        } catch (Exception e) {
            throw new RuntimeException();

        }

    }

    public static void carregarDadosDoArquivo(){
        String linha;
        StringBuilder conteudoDoArquivo = new StringBuilder();

        if (!arquivoBancoDeDados.exists()) { //se o arquivo não existe, cria o arquivo. Se não, pula direto para a leitura do arquivo
            try {
                if(arquivoBancoDeDados.createNewFile()){ // se o arquivo for criado:
                    System.out.println("Arquivo criado " + arquivoBancoDeDados.getName() + " com sucesso!");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoBancoDeDados))){

            while ((linha = bufferedReader.readLine()) != null){ //leia enquanto for diferente de null (quando não existir mais linhas)
                conteudoDoArquivo.append(linha).append("\n"); // o \n após a linha serve para fechar a linha
                // o split retorna um Array
            }

            String [] linhaDadosUsuario = conteudoDoArquivo.toString().split("\n"); //toString transforma o StringBuilder em uma String, para que possamos usar o split, que é um método de strings
            //agrupa tudo e guarda conteudoDoArquivo no Array linhaDadosUsuario

            matrizCadastro = new String[linhaDadosUsuario.length][cabecalho.length]; // nova matrizCadastro montada para comportar o tamanho dos dados

            for (int i = 0; i < linhaDadosUsuario.length; i++) { //pega a linha, quebra ela e coloca no array
                matrizCadastro[i] = linhaDadosUsuario[i].split(","); //quebra os dados em ID, NOME, TELEFONE, EMAIL
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    public static void atualizarUsuarios() {

        exibirUsuarios();

        System.out.println("\nDigite o ID do usuário que deseja atualizar: ");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();

        System.out.println(cabecalho[0] + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.print(cabecalho[coluna] + ": ");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();
        }
        exibirUsuarios();
        salvarDadosNoArquivo();
    }
}

