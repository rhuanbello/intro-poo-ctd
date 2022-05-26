package Aula06.Desafio01;

import java.util.Date;

public class Impressora {
  private String model;
  private String connectionType;
  private Date productionDate;
  private Integer availablePapers;

  public void setAvailablePapers(Integer availablePapers) {
    this.availablePapers = availablePapers;
  }

  public Impressora(String model, String connectionType, Date productionDate) {
    this.model = model;
    this.connectionType = connectionType;
    this.productionDate = productionDate;
    this.availablePapers = 0;
  }

  private Boolean hasPaper() {
    return availablePapers > 0;
  }

  public void print(String text) {
    if (this.hasPaper()) {
      System.out.println("Printed Successfully");
    } else {
      System.out.println("Please, insert more paper in the printer!");
    }
  }

}
