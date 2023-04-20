import java.util.Scanner;

public class CategoriaCnh {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Quantas rodas o veículo possui? ");
    int rodas = ler.nextInt();

    System.out.println("Qual o peso bruto do veículo (Em Kg)? ");
    Float peso = ler.nextFloat();

    System.out.println("Quantas pessoas estarão no veículo? ");
    int pessoas = ler.nextInt();

    if (rodas == 2 || rodas == 3) {
      System.out.println("Habilitação Categoria A");
    } else if (rodas == 4 && pessoas <= 8 && peso <= 3500) {
      System.out.println("Habilitação Categoria B");
    } else if (rodas >= 4 && pessoas >= 8) {
      System.out.println("Habilitação Categoria C");
    } else if (rodas >= 4 || peso >= 6000) {
      System.out.println("Habilitação Categoria D");
    } else {
      System.out.println("Dados Inválidos");
    }

  }
}
