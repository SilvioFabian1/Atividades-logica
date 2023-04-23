import java.util.Scanner;

public class ProgramaParImpar {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    /**
     * checagem de par ou impar sao feitas em numero inteiros, valores float e double nao tem par impar
     */

    System.out.println("Informe o número a ser verificado: ");
    float num = ler.nextFloat();

    if (num % 2 == 0) {
      System.out.println("O número " + num + " é par");
    } else {
      System.out.println("O número " + num + " é impar");
    }

  }
}
