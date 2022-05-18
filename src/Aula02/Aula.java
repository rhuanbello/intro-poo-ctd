package Aula02;

import java.util.Scanner;

public class Aula {
  public static void main(String[] args) {
    String name;
    String lastName;
    int dia;
    int mes;
    int ano;

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um Nome: ");
    name = sc.next();

    System.out.println("Informe um sobrenome : ");
    lastName = sc.next();

    System.out.println("Informe o dia de nascimento: ");
    dia = sc.nextInt();

    System.out.println("Informe o mês de nascimento: ");
    mes = sc.nextInt();

    System.out.println("Informe o ano de nascimento: ");
    ano = sc.nextInt();

    String fullDate = dia + "/" + mes + "/" + ano;
    String nameInitials = returnInitials(name, lastName);

    System.out.println("Meu nome é " + name + " " + lastName + " minhas iniciais são: " + nameInitials);
    System.out.println("Minha data de nascimento é " + fullDate);
  }

  public static String returnInitials(String name, String lastName) {
    return name.charAt(0) + lastName.substring(0, 1).toUpperCase();
  }
}
