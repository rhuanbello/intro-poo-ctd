package Aula05;

public class BancoDigital {
  private int clientNumber;
  private String clientName;
  private Double clientDebt;

  public BancoDigital(int clientNumber, String clientName) {
    this.clientNumber = clientNumber;
    this.clientName = clientName;
    this.clientDebt = 0.0;
  }

  public int getClientNumber() {
    return clientNumber;
  }

  public String getClientName() {
    return clientName;
  }

  public Double getClientDebt() {
    return clientDebt;
  }

  public void setClientNumber(int clientNumber) {
    this.clientNumber = clientNumber;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public void increaseDebit(Double value) {
    this.clientDebt += value;
    System.out.println("Saldo de(o) " + this.clientName + " " + this.clientDebt);
  }

  public void decreaseDebit(Double value) {
    if (this.clientDebt == 0) {
      System.out.println("Não há dívida");
    } else {
      this.clientDebt -= value;
      System.out.println("Saldo de(o) " + this.clientName + " " + this.clientDebt);
    }
  }
}
