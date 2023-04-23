import java.util.Scanner;

public class ProgramaCalculadoraSimples {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Escolha o primeiro número: ");
    float num1 = ler.nextFloat();

    System.out.println("Escolha o segundo número: ");
    float num2 = ler.nextFloat();

    System.out.println("Escolha uma das 4 operações básicas (+, -, *, /): ");
    String operacao = ler.next();

    if (operacao.equals("+")) {
      System.out.println("A soma é: " + (num1 + num2));
    } else if (operacao.equals("-")) {
      System.out.println("A subtração é: " + (num1 - num2));
    } else if (operacao.equals("*")) {
      System.out.println("A multiplicação é: " + (num1 * num2));
    } else if (operacao.equals("/")) {
      System.out.println("A Divisão é: " + (num1 / num2)); // e se eu tentar dividir por zero??? kkkkk
    } else {
      System.out.println("Escolhe a operação certa, minha calculadora é limitada :(");
    }

  }
}
