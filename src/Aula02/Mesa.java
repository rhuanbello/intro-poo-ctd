package Aula02;

import java.util.Scanner;

public class Mesa {
  public static int biggestValue(int[] numbersList) {
    int result = numbersList[0];

    for (int i = 1; i < numbersList.length; i++) {
      if (numbersList[i] > result) {
        result = numbersList[i];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] rates = {0, 0, 0};

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o primeiro número: ");
    rates[0] = sc.nextInt();
    System.out.println("Informe o segundo número: ");
    rates[1] = sc.nextInt();
    System.out.println("Informe o terceiro número: ");
    rates[2] = sc.nextInt();

    int result = biggestValue(rates);
    System.out.println("O maior número é: " + result);

  }
}
