import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[13][3];  // Matriz 13x3 para armazenar nome, matrícula e telefone
        int opcao;
        int contador = 0;  // Controla quantos alunos foram cadastrados

        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("\t1 - CADASTRO");
            System.out.println("\t2 - CONSULTA");
            System.out.println("\t3 - FIM");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    // Verifica se há espaço para novos cadastros na matriz
                    if (contador < 13) {
                        // Pede os dados para cada aluno
                        System.out.println("Cadastro do aluno " + (contador + 1));
                        System.out.print("Insira o nome: ");
                        String nomeA = scanner.nextLine();
                        System.out.print("Insira o número da matrícula: ");
                        String numeroM = scanner.nextLine();
                        System.out.print("Insira o número de telefone: ");
                        String telefoneA = scanner.nextLine();

                        // Armazena as informações na matriz
                        matriz[contador][0] = nomeA;
                        matriz[contador][1] = numeroM;
                        matriz[contador][2] = telefoneA;

                        System.out.println("Cadastro realizado com sucesso!");
                        contador++;  // Incrementa o contador
                    } else {
                        System.out.println("Limite de cadastros atingido.");
                    }
                    break;

                case 2:
                    // Consulta os cadastros
                    System.out.print("Digite o nome do aluno para consulta: ");
                    String nomeConsulta = scanner.nextLine();
                    boolean encontrado = false;

                    // Percorre a matriz para procurar o nome
                    for (int i = 0; i < contador; i++) {
                        if (matriz[i][0].equalsIgnoreCase(nomeConsulta)) {
                            // Se o nome for encontrado, exibe as informações
                            System.out.println("Aluno encontrado:");
                            System.out.println("\tNome: " + matriz[i][0]);
                            System.out.println("\tMatrícula: " + matriz[i][1]);
                            System.out.println("\tTelefone: " + matriz[i][2]);
                            encontrado = true;
                            break;  // Encerra o loop assim que encontrar o aluno
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 3:
                    //sair
                    System.out.println("Fim do programa.");
                    break;

                default:
                    //opção escolhida não existe
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 3);

        scanner.close();
    }
}
