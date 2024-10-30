import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nomeAluno;
        int matricula;

        do{
            System.out.println("Selecione a opção desejada: ");
            System.out.println("\tDigite 1 para incluir cadastro. ");
            System.out.println("\tDigite 2 para consulta de cadastro.");
            System.out.println("\tDigite 3 para sair. ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome: ");
                    nomeAluno = scanner.nextLine();

                    System.out.println("Digite o número da matrícula: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Usuário " + nomeAluno + " de matrícula " + matricula + " cadastrado com sucesso.");
                break;

                case 2:
                    System.out.println("Digite o nome a ser consultado: ");
                    nomeAluno = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Digite o número da matrícula: ");
                    matricula = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Encontrado o usuário " + nomeAluno + " com matrícula " + matricula);
                break;

                case 3:
                    System.out.println("Saindo.");
                    break;

                default:
                    System.out.println("Opção digitada inválida. Pressione Enter e digite novamente.");
                    scanner.nextLine();

            }


        }while(opcao != 3);

    }
}
