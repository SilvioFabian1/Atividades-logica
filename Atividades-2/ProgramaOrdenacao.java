import java.util.Scanner;

public class ProgramaOrdenacao {
  public static void main(String[] args) {
    int tamanho = 10;
    int[] vetor = new int[tamanho];

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite os valores do vetor:");
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Valor " + (i + 1) + ": ");
      vetor[i] = scan.nextInt();
    }

    for (int i = 0; i < tamanho - 1; i++) {
      for (int j = 0; j < tamanho - 1 - i; j++) {
        if (vetor[j] > vetor[j + 1]) {
          int temp = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = temp;
        }
      }
    }

    System.out.println("Vetor em ordem crescente:");
    for (int i = 0; i < tamanho; i++) {
      System.out.println(vetor[i]);
    }
  }
}
