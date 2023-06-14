import java.util.Scanner;

public class ProgramaPar {
  public static void main(String[] args) {
    int tamanho = 10;
    int[] numeros = new int[tamanho];

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite 10 valores:");
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Valor " + (i + 1) + ": ");
      numeros[i] = scan.nextInt();
    }

    System.out.println("Números pares:");
    for (int i = 0; i < tamanho; i++) {
      if (numeros[i] % 2 == 0) {
        System.out.println(numeros[i]);
      }
    }
  }
}
