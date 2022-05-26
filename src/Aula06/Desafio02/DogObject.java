package Aula06.Desafio02;

public class DogObject {
  public static void main(String[] args) {
    Dog dogOne = new Dog("São Lourenço", 2018, 7.5);

    System.out.println("Idade " + dogOne.caculateAge());
    dogOne.setInjured(true);
    dogOne.setHaveChip(true);
    System.out.println("Disponível " + dogOne.checkAdoptionAvailability());
    dogOne.setInjured(false);
    System.out.println("Disponível " + dogOne.checkAdoptionAvailability());
  }
}
