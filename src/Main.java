import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            System.out.println("1 - Inserir no início");
            System.out.println("2 - Inserir no fim");
            System.out.println("3 - Remover do início");
            System.out.println("4 - Remover do fim");
            System.out.println("5 - Listar");
            System.out.println("0 - Sair");
            System.out.print("--- Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do professor: ");
                    String nomeInicio = scanner.nextLine();
                    lista.inserirInicio(new Professor(nomeInicio));
                    break;
                case 2:
                    System.out.print("Nome do professor: ");
                    String nomeFim = scanner.nextLine();
                    lista.inserirFim(new Professor(nomeFim));
                    break;
                case 3:
                    System.out.println("--- Removido do início");
                    lista.removerInicio();
                    lista.listar();
                    break;
                case 4:
                    System.out.println("--- Removido do fim");
                    lista.removerFim();
                    lista.listar();
                    break;
                case 5:
                    lista.listar();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

}