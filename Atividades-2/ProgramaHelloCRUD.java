import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaHelloCRUD {
  public static void main(String[] args) {
    ArrayList<String> alunos = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("1. Adicionar aluno");
      System.out.println("2. Listar alunos");
      System.out.println("3. Atualizar aluno");
      System.out.println("4. Remover aluno");
      System.out.println("5. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scan.nextInt();

      switch (opcao) {
        case 1:
          scan.nextLine();
          System.out.print("Digite o nome do aluno: ");
          String nome = scan.nextLine();
          alunos.add(nome);
          System.out.println("Aluno adicionado com sucesso!");
          break;

        case 2:
          if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
          } else {
            System.out.println("Alunos cadastrados:");
            for (String aluno : alunos) {
              System.out.println(aluno);
            }
          }
          break;

        case 3:
          scan.nextLine();
          System.out.print("Digite o nome do aluno a ser atualizado: ");
          String alunoAntigo = scan.nextLine();
          System.out.print("Digite o novo nome do aluno: ");
          String alunoNovo = scan.nextLine();
          if (alunos.contains(alunoAntigo)) {
            int indice = alunos.indexOf(alunoAntigo);
            alunos.set(indice, alunoNovo);
            System.out.println("Aluno atualizado com sucesso!");
          } else {
            System.out.println("Aluno não encontrado.");
          }
          break;

        case 4:
          scan.nextLine();
          System.out.print("Digite o nome do aluno a ser removido: ");
          String alunoRemover = scan.nextLine();
          if (alunos.contains(alunoRemover)) {
            alunos.remove(alunoRemover);
            System.out.println("Aluno removido com sucesso!");
          } else {
            System.out.println("Aluno não encontrado.");
          }
          break;

        case 5:
          System.out.println("Encerrando o programa...");
          break;

        default:
          System.out.println("Opção inválida! Tente novamente.");
          break;
      }

      System.out.println();
    } while (opcao != 5);
  }
}
