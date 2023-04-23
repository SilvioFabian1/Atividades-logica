import java.util.Scanner;

public class ProgramaMedia {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Escreva a Primeira nota: ");
    float nota1 = ler.nextFloat();

    System.out.println("Escreva a Segunda nota: ");
    float nota2 = ler.nextFloat();

    System.out.println("Escreva a Terceira nota: ");
    float nota3 = ler.nextFloat();

    float notaFinal = (nota1 + (nota2 * 2) + (nota3 * 3)) / 6;

    // faltou colocar o conceito final A, B, C, D, E
    if (notaFinal < 60) {
      System.out.println("Reprovado");
    } else if (notaFinal >= 60 && notaFinal <= 100) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Põe as nota certa");
    }

  }
}
