import java.util.Scanner;

public class ProgramaSoma {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Insira o primeiro número: ");
    int a = ler.nextInt();

    System.out.println("Insira o segundo número: ");
    int b = ler.nextInt();

    int c;

    if (a > b) {
      c = a + b;
      System.out.println("O resultado da soma: " + c);
    } else {
      c = a * b;
      System.out.println("O resultado da multiplicação: " + c);
    }

    // Não entendi oq quis dizer com "Informar o caminho utilizado"
  }
}
