import java.util.Scanner;

public class ProgramaParImpar {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o número a ser verificado: ");
    float num = ler.nextFloat();

    if (num % 2 == 0) {
      System.out.println("O número " + num + " é par");
    } else {
      System.out.println("O número " + num + " é impar");
    }

  }
}
