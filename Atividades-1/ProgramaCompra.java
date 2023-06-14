import java.util.Scanner;

public class ProgramaCompra {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o preço do produto: ");
    float preco = ler.nextFloat();

    System.out.println("Qual será a forma de pagamento? (Digite se quer A, B ou C)");
    System.out.println("A) A vista, pix ou débito");
    System.out.println("B) Crédito a vista");
    System.out.println("C) Crédito parcelado");

    String opcao = ler.next();
    String opcaoCorrigida = opcao.toUpperCase();

    if (opcaoCorrigida.equals("A")) {
      System.out.println("R$ " + preco * 0.9f);
    } else if (opcaoCorrigida.equals("B")) {
      System.out.println("R$ " + preco);
    } else if (opcaoCorrigida.equals("C")) {
      System.out.println("Informe em quantas parcelas: "); //e se eu colocar parcelado em 1 parcela??? nao deveria ter juros mas tem kkkkk
      int parc = ler.nextInt();
      float ultimoPreco = preco * 0.01f * parc;
      System.out.println("Serão " + parc + " parcelas de R$" + ultimoPreco);
    } else {
      System.out.println("Opção inválida");
    }
  }
}