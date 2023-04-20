import java.util.Scanner;

public class ProgramaDobroTriplo {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Insira o número: ");
    int num1 = ler.nextInt();

    if (num1 < 0) {
      System.out.println("O triplo é: " + num1 * 3);
    } else if (num1 >= 0) {
      System.out.println("O dobro é: " + num1 * 2);
    }
  }
}
