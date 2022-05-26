package Aula06.Desafio01;

import java.time.LocalDate;
import java.util.Date;

public class ImpressoraObj {
  public static void main(String[] args) {
    Date myDate = new Date(2014, 02, 11);
    Impressora printerOne = new Impressora("Impressora 01", "USB", myDate);

    printerOne.print("Texto");
    printerOne.setAvailablePapers(10);
    printerOne.print("Nova tentativa");
  }
}
