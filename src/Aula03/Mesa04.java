package Aula03;

import java.util.Scanner;

public class Mesa04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int firstPlayerWins = 0;
    int secondPlayerWins = 0;

    System.out.println("Insira o nome do 1° jogador: ");
    String firstPlayer = sc.next();

    System.out.println("Insira o nome do 2° jogador: ");
    String secondPlayer = sc.next();

    Boolean stillPlaying = true;

    while (stillPlaying) {
      System.out.println("Insira sua jogada " + firstPlayer);
      int firstPlayerPlay = computePlay(sc);

      System.out.println("Insira sua jogada " + secondPlayer);
      int secondPlayerPlay = computePlay(sc);;

      int result = matchResult(firstPlayerPlay, secondPlayerPlay);

      if (result == 0) {
        System.out.println("Empate!");
      } else if (result == 1){
        System.out.println("O Jogador " + firstPlayer + " venceu!");
        firstPlayerWins++;
      } else {
        System.out.println("O Jogador " + secondPlayer + " venceu!");
        secondPlayerWins++;
      }

      System.out.println("Resultados atuais: ");
      System.out.println("Jogador " + firstPlayer + " possui " + firstPlayerWins + " pontos");
      System.out.println("Jogador " + secondPlayer + " possui " + secondPlayerWins + " pontos");
      System.out.println();
      System.out.println("Deseja continuar jogando?");
      System.out.println("0 - Parar");
      System.out.println("1 - Continuar");

      int playerDecision = sc.nextInt();
      if (playerDecision == 0) stillPlaying = false;
    }

    if (firstPlayerWins == secondPlayerWins) {
      System.out.println("Ninguém venceu! Empate!");
    } else if (firstPlayerWins > secondPlayerWins) {
      System.out.println("Jogador " + firstPlayer + " venceu com " + firstPlayerWins + " pontos!");
    } else {
      System.out.println("Jogador " + secondPlayer + " venceu com " + secondPlayerWins + " pontos!");
    }
  }

  public static int computePlay(Scanner sc) {
    System.out.println("1 - Pedra");
    System.out.println("2 - Papel");
    System.out.println("3 - Tesoura");
    System.out.println("4 - Spock");

    return sc.nextInt();
  }

  public static int matchResult(int firstPlayerPlay, int secondPlayerPlay) {
    switch (firstPlayerPlay) {
      case 1:
        switch (secondPlayerPlay) {
          case 2:
          case 4:
            return 2;
          default:
            return 1;
        }
      case 2:
        switch (secondPlayerPlay) {
          case 1:
          case 4:
            return 1;
          default:
            return 2;
        }
      case 3:
        switch (secondPlayerPlay) {
          case 1:
          case 4:
            return 2;
          default:
            return 1;
        }
      case 4:
        switch (secondPlayerPlay) {
          case 1:
          case 3:
            return 1;
          default:
            return 2;
        }
      default:
        return 0;
    }
  }
}
