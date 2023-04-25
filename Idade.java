import java.util.Scanner;
import java.util.Arrays;

public class Idade {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    // era pra usar lacos, assim vc tem o trabalho de corno de fazer uma a uma, e se forem 1000 idades?
    // vetor???

    int idade1, idade2, idade3, idade4, idade5, idade6, idade7, idade8, idade9, idade10, idade11, idade12;

    System.out.println("Digite a primeira idade");
    idade1 = ler.nextInt();

    System.out.println("Digite a segunda idade");
    idade2 = ler.nextInt();

    System.out.println("Digite a terceira idade");
    idade3 = ler.nextInt();

    System.out.println("Digite a quarta idade");
    idade4 = ler.nextInt();

    System.out.println("Digite a quinta idade");
    idade5 = ler.nextInt();

    System.out.println("Digite a sexta idade");
    idade6 = ler.nextInt();

    System.out.println("Digite a sétima idade");
    idade7 = ler.nextInt();

    System.out.println("Digite a oitava idade");
    idade8 = ler.nextInt();

    System.out.println("Digite a nona idade");
    idade9 = ler.nextInt();

    System.out.println("Digite a décima idade");
    idade10 = ler.nextInt();

    System.out.println("Digite a décima primeira idade");
    idade11 = ler.nextInt();

    System.out.println("Digite a décima segunda idade");
    idade12 = ler.nextInt();

    int[] idades = { idade1, idade2, idade3, idade4, idade5, idade6, idade7, idade8, idade9, idade10, idade11,
        idade12 };

    Arrays.sort(idades);

    System.out.println("A menor idade é " + idades[0]);
    System.out.println("A maior idade é " + idades[11]);

  }
}
