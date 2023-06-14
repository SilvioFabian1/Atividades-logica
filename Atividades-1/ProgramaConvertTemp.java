import java.util.Scanner;

public class ProgramaConvertTemp {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite a temperatura em Celsius: ");
    float tempC = ler.nextFloat();

    float tempK = tempC + 273.15f; // .15 eu achei no google
    float tempF = (tempC * (1.8f)) + 32; // Achei no google tbm kkk

    System.out.println("De Celsius para Fahrenheit: " + tempF);
    System.out.println("De Celsius para Kelvin: " + tempK);

  }

}
