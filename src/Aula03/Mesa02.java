package Aula03;

import java.util.Scanner;

public class Mesa02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do seu pet: ");
    String name = scanner.next();

    System.out.println("Digite a quantidade de kg's: ");
    int weight = scanner.nextInt();

    howManyPackages(name, weight, scanner);
  }

  public static void howManyPackages(String name, int weight, Scanner scanner) {

    int max = 0;
    int packages = 0;

    do {
      System.out.println("Digite o kg do pacote n°: " + (packages + 1));
      float userInput = scanner.nextFloat();
      max += userInput;
      packages++;
    }
    while (max < weight);

    System.out.println(name + " precisa de " + packages + " pacotes.");
  }

}
