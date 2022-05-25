package Aula05;

public class ObjetoBancoDigital {
  public static void main(String[] args) {
    BancoDigital clientOne = new BancoDigital(01, "Rhuan Bello");
    BancoDigital clientTwo = new BancoDigital(02, "Diana Tolotti");
    BancoDigital clientThree = new BancoDigital(03, "Giovanna Manfro");

    clientOne.increaseDebit(1000.00);
    clientOne.setClientName("Novo nome");

  }
}
