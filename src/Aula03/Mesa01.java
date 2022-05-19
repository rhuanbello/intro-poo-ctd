package Aula03;

import java.util.Scanner;

public class Mesa01 {

  public static void main(String[] args) {
    System.out.println("Insira uma quantidade de números primos: ");
    Scanner scanner = new Scanner(System.in);

    int maxPrimeNumbers = scanner.nextInt();
    int primeNumbersFound = 0;
    int number = 2;

    while (primeNumbersFound < maxPrimeNumbers) {
      if (isPrimeNumber(number)) {
        System.out.println(number + " é um número primo");
        primeNumbersFound++;
      }
      number++;
    }
  }
  public static boolean isPrimeNumber(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0)
        return false;
    }
    return true;
  }
}


