import java.util.Scanner;

public class ProgramaSomaSimples {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o primeiro número: ");
    float num1 = ler.nextFloat();

    System.out.println("Informe o segundo número: ");
    float num2 = ler.nextFloat();

    float soma = num1 + num2;

    System.out.println("A soma é: " + soma);

  }
}