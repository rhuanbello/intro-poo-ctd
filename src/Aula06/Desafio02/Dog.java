package Aula06.Desafio02;

import java.util.Date;

public class Dog {
  private String breed;
  private Integer birthYear;
  private Double weight;
  private Boolean haveChip;
  private Boolean isInjured;

  public Dog(String breed, Integer birthYear, Double weight) {
    this.breed = breed;
    this.birthYear = birthYear;
    this.weight = weight;
    this.isInjured = false;
    this.haveChip = false;
  }

  public int caculateAge(){
    return (new Date().getYear() + 1900) - this.birthYear;
  }

  public Boolean checkAdoptionAvailability() {
    return !this.isInjured && this.weight > 5.0;
  }

  public void setHaveChip(Boolean haveChip) {
    this.haveChip = haveChip;
  }

  public void setInjured(Boolean injured) {
    isInjured = injured;
  }
}
