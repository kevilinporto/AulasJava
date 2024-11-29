package Desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos usuários você quer cadastrar? ");

        int qtdUsuarios = scanner.nextInt(); // quantidade de pessoas a serem cadastradas
        scanner.nextLine(); // limpa o \n
        String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
        String[][] matrizCadastro = new String[qtdUsuarios + 1][cabecalho.length];
        matrizCadastro[0] = cabecalho; // a primeira linha é o cabeçalho

        for (int linhas = 1; linhas <= qtdUsuarios; linhas++) { // por causa disso, o contador linhas deverá começar em 1
            System.out.println("Preencha as informações: ");
            System.out.println("Cadastro do usuário " + linhas);

            System.out.println("ID - " + linhas);
            matrizCadastro[linhas][0] = String.valueOf(linhas);
            System.out.print("Nome: ");
            matrizCadastro[linhas][1] = scanner.nextLine();
            System.out.print("Telefone: ");
            matrizCadastro[linhas][2] = scanner.nextLine();
            System.out.print("Email: ");
            matrizCadastro[linhas][3] = scanner.nextLine();

        }
        String tabela = "";
        for (String[] linha : matrizCadastro) { //for para pegar cada linha de matrizCadastro
            for (int coluna = 0; coluna < matrizCadastro[0].length; coluna++) { // esse for interno faz cada coluna
                tabela += linha[coluna] + "\t\t";

            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }
}

