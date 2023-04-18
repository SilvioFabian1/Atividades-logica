import java.util.Scanner;

public class ProgramaHelloWorld {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe a idade: ");
    int idade = ler.nextInt();

    System.out.println("Informe seu primeiro nome: ");
    String nome = ler.next();

    System.out.println("Informe seu último nome: ");
    String segundoNome = ler.next();

    System.out.println("Olá " + nome + " " + segundoNome + " sua idade é " + idade);

  }
}